package com.xworkz.basic.laptop;

import com.xworkz.basic.laptop.gamingLaptop.GamingLaptop;

public class LaptopRunner {

    public static void main(String args[]) {
        Laptop laptop = new  GamingLaptop();
        GamingLaptop gamingLaptop =  (GamingLaptop)laptop;
        laptop.brand();
        laptop.processor();
        gamingLaptop.brand();
        gamingLaptop.processor();
    }
}
