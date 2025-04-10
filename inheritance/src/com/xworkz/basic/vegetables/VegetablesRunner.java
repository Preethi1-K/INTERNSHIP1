package com.xworkz.basic.vegetables;


import com.xworkz.basic.vegetables.raddish.Raddish;

public class VegetablesRunner {

    public static void main(String args[]) {

        Vegetables vegetables = new Vegetables();
        vegetables.healthy();
        vegetables.types();

        Raddish ground = new Raddish();
        ground.healthy();
        ground.types();
    }
}
