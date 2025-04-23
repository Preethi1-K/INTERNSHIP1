package com.xworkz.tostring;

import com.xworkz.tostring.toString.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Toyota");
        vehicle.setModel("Corolla");
        vehicle.setSpeed(180);
        vehicle.setPrice(25000.0);
        vehicle.setColor("White");

        System.out.println(vehicle.toString());
    }
}
