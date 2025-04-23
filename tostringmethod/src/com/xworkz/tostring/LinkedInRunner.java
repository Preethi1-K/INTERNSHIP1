package com.xworkz.tostring;

import com.xworkz.tostring.toString.LinkedIn;

public class LinkedInRunner
{
    public static void main(String[] args) {
        LinkedIn linkedIn = new LinkedIn();
        linkedIn.setPlatformName("LinkedIn");
        linkedIn.setUserCount(800000000);
        linkedIn.setFounder("Reid Hoffman");
        linkedIn.setYearFounded("2002");
        linkedIn.setHeadquarters("Sunnyvale, California");

        System.out.println(linkedIn.toString());
    }
}
