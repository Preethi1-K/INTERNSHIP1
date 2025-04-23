package com.xworkz.tostring;

import com.xworkz.tostring.toString.Trees;

public class TreesRunner {
    public static void main(String[] args) {
        Trees tree = new Trees();
        tree.setSpecies("Oak");
        tree.setHeight(15.5);
        tree.setAge(50);
        tree.setLocation("North America");
        tree.setType("Deciduous");

        System.out.println(tree.toString());
    }
}
