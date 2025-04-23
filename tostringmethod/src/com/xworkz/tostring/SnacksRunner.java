package com.xworkz.tostring;

import com.xworkz.tostring.toString.Snacks;

public class SnacksRunner {
    public static void main(String[] args) {
        Snacks snacks = new Snacks();
        snacks.setName("Chips");
        snacks.setType("Salty");
        snacks.setPrice(50.0);
        snacks.setBrand("Lays");
        snacks.setFlavor("Classic");

        System.out.println(snacks.toString());
    }
}
