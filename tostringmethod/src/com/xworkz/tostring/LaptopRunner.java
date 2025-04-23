package com.xworkz.tostring;

import com.xworkz.tostring.toString.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setProcessor("Intel i7");
        laptop.setStorage(512);
        laptop.setPrice(75999.50);

        System.out.println(laptop.toString());
    }
}
