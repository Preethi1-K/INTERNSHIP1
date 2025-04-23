package com.xworkz.tostring;

import com.xworkz.tostring.toString.Garden;

public class GardenRunner {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.setName("Lalbagh");
        garden.setCity("Bangalore");
        garden.setTrees(1000);
        garden.setHasFountain(true);

        System.out.println(garden.toString());
    }
}
