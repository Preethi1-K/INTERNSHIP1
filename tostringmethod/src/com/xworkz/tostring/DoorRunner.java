package com.xworkz.tostring;

import com.xworkz.tostring.toString.Door;

public class DoorRunner {
    public static void main(String[] args) {
        Door door = new Door();
        door.setMaterial("Wood");
        door.setColor("Brown");
        door.setType("Swing");
        door.setHeight(7.0);
        door.setWidth(3.0);

        System.out.println(door.toString());
    }
}
