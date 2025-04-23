package com.xworkz.tostring;

import com.xworkz.tostring.toString.Trip;

public class TripRunner {
    public static void main(String[] args) {
        Trip trip = new Trip();
        trip.setDestination("Paris");
        trip.setModeOfTransport("Airplane");
        trip.setDuration(7);
        trip.setCost(2000.0);
        trip.setPurpose("Vacation");

        System.out.println(trip.toString());
    }
}
