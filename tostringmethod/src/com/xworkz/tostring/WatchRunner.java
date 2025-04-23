package com.xworkz.tostring;

import com.xworkz.tostring.toString.Watch;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch();
        watch.setBrand("Rolex");
        watch.setType("Analog");
        watch.setPrice(50000.0);
        watch.setColor("Silver");

        System.out.println(watch.toString());
    }
}
