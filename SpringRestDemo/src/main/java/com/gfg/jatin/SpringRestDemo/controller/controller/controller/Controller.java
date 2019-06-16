package com.gfg.jatin.SpringRestDemo.controller.controller.controller;
import org.springframework.web.bind.annotation.*;
import userModel.User;
import userModel.UserDataClass;

import java.util.*;

import static userModel.UserDataClass.user_data;


@RestController
public class Controller {


    @PostMapping("/user")
    public Boolean createUser(User user){

        if(!user_data.containsValue(user)) {
            user_data.put(user.getId(), user);
            return true;
        }
        else{
            return false;
        }
    }

    @GetMapping("/users")
    public List<User> getUser(){
        ArrayList<User> al = new ArrayList<User>();

        for(Map.Entry<Long,User> users : user_data.entrySet()){
            User user_temp = users.getValue();
            al.add(user_temp);
        }
        return al;
    }
    @PutMapping("/user")
    public User writeUsers(@RequestBody User user){

        Long id = user.getId();
        User data_found ;
        if(user_data.containsKey(id)) {
            user_data.put(id, user);
            data_found = user_data.get(id);
            return data_found;
        }
        else{
            return null;
        }
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUsers(@PathVariable Long id){

        if(user_data.containsKey(id)) {
            user_data.remove(id);
            return true;
        }
        else{
            return false;
        }
    }


}
