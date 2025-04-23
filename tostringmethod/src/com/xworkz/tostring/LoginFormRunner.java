package com.xworkz.tostring;

import com.xworkz.tostring.toString.LoginForm;

public class LoginFormRunner {
    public static void main(String[] args) {
        LoginForm login = new LoginForm();
        login.setUsername("babaUser");
        login.setPassword("secure@123");
        login.setRememberMe(true);
        login.setLoginTime("2025-04-22 09:00 AM");

        System.out.println(login.toString());
    }
}
