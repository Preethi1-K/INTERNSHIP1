package com.xworkz.basic.vegetables;


import com.xworkz.basic.vegetables.raddish.Raddish;

public class VegetablesRunner {

    public static void main(String args[]) {

        Vegetables vegetables = new Raddish();
        Raddish ground =  (Raddish)vegetables;
        vegetables.healthy();
        vegetables.types();
        ground.healthy();
        ground.types();
    }
}
