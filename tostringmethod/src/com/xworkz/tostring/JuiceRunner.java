package com.xworkz.tostring;

import com.xworkz.tostring.toString.Juice;

public class JuiceRunner {
    public static void main(String[] args) {
        Juice juice = new Juice();
        juice.setFlavor("Mango");
        juice.setBrand("Real");
        juice.setQuantity(1.0);
        juice.setCold(true);

        System.out.println(juice.toString());
    }
}
