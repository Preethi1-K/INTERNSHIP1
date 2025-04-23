package com.xworkz.tostring;

import com.xworkz.tostring.toString.Grinder;

public class GrinderRunner {
    public static void main(String[] args) {
        Grinder grinder = new Grinder();
        grinder.setBrand("Bajaj");
        grinder.setType("Wet");
        grinder.setPower(500);
        grinder.setColor("White");
        grinder.setPrice(4500.0);

        System.out.println(grinder.toString());
    }
}
