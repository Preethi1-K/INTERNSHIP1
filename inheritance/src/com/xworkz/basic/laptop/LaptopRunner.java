package com.xworkz.basic.laptop;

import com.xworkz.basic.laptop.gamingLaptop.GamingLaptop;

public class LaptopRunner {

    public static void main(String args[]) {
        Laptop laptop = new Laptop();
        laptop.brand();
        laptop.processor();

        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.brand();
        gamingLaptop.processor();
    }
}
