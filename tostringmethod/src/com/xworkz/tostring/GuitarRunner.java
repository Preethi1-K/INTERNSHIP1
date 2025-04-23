package com.xworkz.tostring;

import com.xworkz.tostring.toString.Guitar;

public class GuitarRunner {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.setBrand("Fender");
        guitar.setType("Electric");
        guitar.setStrings(6);
        guitar.setPrice(1200.99);

        System.out.println(guitar.toString());
    }
}
