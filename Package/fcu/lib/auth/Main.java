package fcu.lib.auth;

import fcu.lib.user.User;
import fcu.lib.user.UserManager;

import java.util.Date;


public class Main extends Signin {

    /*
    若Signin使用protected
    protected void sayHello() {
        super.sayHello();
    }
    */

    public void sayHello() {
        super.sayHello();
    }

    public static void main(String[] args) {
        User user = new User();
        UserManager manager = new UserManager();
        Date date = new Date();




    }
}