package com.xworkz.tostring;

import com.xworkz.tostring.toString.IceCream;

public class IceCreamRunner {
    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        iceCream.setFlavor("Vanilla");
        iceCream.setPrice(120.0);
        iceCream.setWeight(500.0);
        iceCream.setBrand("Amul");

        System.out.println(iceCream.toString());
    }
}
