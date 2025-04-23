package com.xworkz.tostring;

import com.xworkz.tostring.toString.Bag;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.setBrand("Skybags");
        bag.setColor("Black");
        bag.setCapacity(30);
        bag.setPrice(2499.99);

        System.out.println(bag.toString());
    }
}
