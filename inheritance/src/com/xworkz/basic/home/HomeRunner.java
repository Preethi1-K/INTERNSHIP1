package com.xworkz.basic.home;

import com.xworkz.basic.home.parking.Parking;

public class HomeRunner {

    public static void main(String args[]) {

        Home home = new Parking() ;
        Parking ground = (Parking)home;
        home.shelter();
        home.comfort();
        ground.shelter();
        ground.comfort();
    }
}
