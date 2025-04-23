package com.xworkz.tostring;

import com.xworkz.tostring.toString.Cotton;

public class CottonRunner {
    public static void main(String[] args) {
        Cotton cotton = new Cotton();
        cotton.setType("Organic");
        cotton.setPricePerKg(150.0);
        cotton.setQuantity(1000.0);
        cotton.setOrigin("India");

        System.out.println(cotton.toString());
    }
}
