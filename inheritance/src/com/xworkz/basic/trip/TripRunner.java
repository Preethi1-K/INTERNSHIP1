package com.xworkz.basic.trip;
import com.xworkz.basic.trip.adventureTrip.AdventureTrip;

public class TripRunner {


    public static void main(String args[])
    {

        Trip trip = new AdventureTrip();
        AdventureTrip adventureTrip = (AdventureTrip)trip;
        trip.travel();
        trip.enjoy();
        adventureTrip.travel();
        adventureTrip.enjoy();
    }
}
