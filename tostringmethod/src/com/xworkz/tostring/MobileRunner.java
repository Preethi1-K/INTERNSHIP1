package com.xworkz.tostring;

import com.xworkz.tostring.toString.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setBrand("Samsung");
        mobile.setModel("Galaxy S23");
        mobile.setRam(8);
        mobile.setPrice(79999.99);

        System.out.println(mobile.toString());
    }
}
