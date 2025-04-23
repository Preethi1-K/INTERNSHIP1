package com.xworkz.tostring;

import com.xworkz.tostring.toString.TV;

public class TVRunner {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.setBrand("Samsung");
        tv.setSize(55.0);
        tv.setResolution("4K");
        tv.setSmart(true);
        tv.setPrice(50000);

        System.out.println(tv.toString());
    }
}
