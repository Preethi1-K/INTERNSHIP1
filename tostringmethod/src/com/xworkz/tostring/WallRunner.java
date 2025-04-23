package com.xworkz.tostring;

import com.xworkz.tostring.toString.Wall;

public class WallRunner {
    public static void main(String[] args) {
        Wall wall = new Wall();
        wall.setMaterial("Brick");
        wall.setHeight(10.5);
        wall.setWidth(15.0);
        wall.setColor("White");

        System.out.println(wall.toString());
    }
}
