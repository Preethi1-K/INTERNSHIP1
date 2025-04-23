package com.xworkz.tostring;

import com.xworkz.tostring.toString.Oil;

public class OilRunner {
    public static void main(String[] args) {
        Oil oil = new Oil();
        oil.setType("Vegetable");
        oil.setQuantity(2.0);
        oil.setPrice(100.0);
        oil.setBrand("Fortune");

        System.out.println(oil.toString());
    }
}
