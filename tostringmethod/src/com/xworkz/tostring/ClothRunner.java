package com.xworkz.tostring;

import com.xworkz.tostring.toString.Cloth;

public class ClothRunner {
    public static void main(String[] args) {
        Cloth cloth = new Cloth();
        cloth.setMaterial("Cotton");
        cloth.setColor("Red");
        cloth.setPrice(500.0);
        cloth.setLength(3.5);

        System.out.println(cloth.toString());
    }
}
