package com.xworkz.tostring;

import com.xworkz.tostring.toString.Transistor;

public class TransistorRunner {
    public static void main(String[] args) {
        Transistor transistor = new Transistor();
        transistor.setBrand("Sony");
        transistor.setType("Bipolar");
        transistor.setPowerRating(5.0);
        transistor.setModel("T123");

        System.out.println(transistor.toString());
    }
}
