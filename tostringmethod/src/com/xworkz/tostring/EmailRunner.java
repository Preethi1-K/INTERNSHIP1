package com.xworkz.tostring;

import com.xworkz.tostring.toString.Email;

public class EmailRunner {
    public static void main(String[] args) {
        Email email = new Email();
        email.setProviderName("Gmail");
        email.setUserCount(1500000000);
        email.setFounder("Larry Page & Sergey Brin");
        email.setYearFounded("2004");
        email.setHeadquarters("Mountain View, California");

        System.out.println(email.toString());
    }
}
