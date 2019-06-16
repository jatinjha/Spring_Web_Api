package userModel;

import java.util.HashMap;

public class UserDataClass {

    public static HashMap<Long , User> user_data = new HashMap<>();

    static{

        User u1 = new User(0,"jatin","jha");
        User u2 = new User(1,"atin","jha");
        User u3 = new User(2,"tin","jha");
        User u4 = new User(3,"in","jha");

        user_data.put((long)0,u1);
        user_data.put((long)1,u1);
        user_data.put((long)2,u2);
        user_data.put((long)3,u3);
    }


}
