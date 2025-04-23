package com.xworkz.tostring;

import com.xworkz.tostring.toString.Dustpin;

public class DustpinRunner {
    public static void main(String[] args) {
        Dustpin dustpin = new Dustpin();
        dustpin.setMaterial("Plastic");
        dustpin.setCapacity(15.0);
        dustpin.setColor("Green");

        System.out.println(dustpin.toString());
    }
}
