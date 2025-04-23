package com.xworkz.tostring;

import com.xworkz.tostring.toString.Fruits;

public class FruitRunner {
    public static void main(String[] args) {
        Fruits fruit = new Fruits();
        fruit.setName("Mango");
        fruit.setColor("Yellow");
        fruit.setWeight(0.35);
        fruit.setSeasonal(true);

        System.out.println(fruit.toString());
    }
}
