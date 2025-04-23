package com.xworkz.tostring;

import com.xworkz.tostring.toString.Twitter;

public class TwitterRunner {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.setHandle("@elonmusk");
        twitter.setFollowersCount(45000000);
        twitter.setTweetsCount(5000);
        twitter.setBio("Entrepreneur, Engineer, CEO of SpaceX and Tesla");
        twitter.setJoinDate("June 2009");

        System.out.println(twitter.toString());
    }
}
