package com.xworkz.tostring;

import com.xworkz.tostring.toString.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.setBrand("Milton");
        bottle.setCapacity(1.5);
        bottle.setMaterial("Steel");
        bottle.setColor("Silver");

        System.out.println(bottle.toString());
    }
}
