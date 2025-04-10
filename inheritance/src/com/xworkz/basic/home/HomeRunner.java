package com.xworkz.basic.home;

import com.xworkz.basic.home.parking.Parking;

public class HomeRunner {

    public static void main(String args[]) {

        Home home = new Home();
        home.shelter();
        home.comfort();

        Parking ground = new Parking();
        ground.shelter();
        ground.comfort();
    }
}
