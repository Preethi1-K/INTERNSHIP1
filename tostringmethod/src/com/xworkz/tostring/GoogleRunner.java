package com.xworkz.tostring;

import com.xworkz.tostring.toString.Google;

public class GoogleRunner {
    public static void main(String[] args) {
        Google google = new Google();
        google.setFounder("Larry Page & Sergey Brin");
        google.setProductName("Search Engine");
        google.setUserCount("5000000000");
        System.out.println(google.toString());
    }
}

