package com.xworkz.tostring;

import com.xworkz.tostring.toString.Instagram;

public class InstagramRunner {
    public static void main(String[] args) {
        Instagram insta = new Instagram();
        insta.setUsername("travel.with.zen");
        insta.setFollowers(12000);
        insta.setPosts(345);
        insta.setVerified(true);

        System.out.println(insta.toString());
    }
}
