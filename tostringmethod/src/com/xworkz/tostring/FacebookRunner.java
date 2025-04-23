package com.xworkz.tostring;

import com.xworkz.tostring.toString.Facebook;

public class FacebookRunner {
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        fb.setProfileName("John Doe");
        fb.setFriends(500);
        fb.setActive(true);
        fb.setStatus("Enjoying Life!");

        System.out.println(fb.toString());
    }
}
