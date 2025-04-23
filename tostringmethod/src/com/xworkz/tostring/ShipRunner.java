package com.xworkz.tostring;

import com.xworkz.tostring.toString.Ship;

public class ShipRunner {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.setName("Titanic");
        ship.setType("Cruise");
        ship.setCapacity(5000.0);
        ship.setLength(270.0);

        System.out.println(ship.toString());
    }
}
