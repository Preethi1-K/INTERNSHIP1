package com.xworkz.tostring;

import com.xworkz.tostring.toString.Zoo;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setName("Bannerghatta");
        zoo.setLocation("Bangalore");
        zoo.setAnimals(120);
        zoo.setArea(100.5);

        System.out.println(zoo.toString());
    }
}
