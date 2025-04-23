package com.xworkz.tostring;

import com.xworkz.tostring.toString.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box box = new Box();
        box.setMaterial("Cardboard");
        box.setColor("Brown");
        box.setHeight(10.5);
        box.setWidth(15.3);

        System.out.println(box.toString());
    }
}
