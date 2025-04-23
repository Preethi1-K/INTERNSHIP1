package com.xworkz.tostring;

import com.xworkz.tostring.toString.Color;

public class ColorRunner {
    public static void main(String[] args) {
        Color color = new Color();
        color.setName("Sky Blue");
        color.setHexCode("#87CEEB");
        color.setPrimary(false);
        color.setFamily("Blue");

        System.out.println(color.toString());
    }
}
