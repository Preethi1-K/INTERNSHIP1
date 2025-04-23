package com.xworkz.tostring;

import com.xworkz.tostring.toString.Fridge;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.setBrand("Samsung");
        fridge.setModel("RT28T");
        fridge.setCapacity(300);
        fridge.setColor("Silver");
        fridge.setPrice(25000.0);

        System.out.println(fridge.toString());
    }
}
