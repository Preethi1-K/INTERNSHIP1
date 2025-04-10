package com.xworkz.basic.trip;
import com.xworkz.basic.trip.adventureTrip.AdventureTrip;

public class TripRunner {


    public static void main(String args[])
    {

        Trip trip = new Trip();
        trip.travel();
        trip.enjoy();

        AdventureTrip adventureTrip = new AdventureTrip();
        adventureTrip.travel();
        adventureTrip.enjoy();
    }
}
