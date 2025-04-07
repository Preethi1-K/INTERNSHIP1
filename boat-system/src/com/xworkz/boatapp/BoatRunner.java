package com.xworkz.boatapp;
 import com.xworkz.boatapp.boat.Boat;


public class BoatRunner {
    public static void main(String arg[]) {
        System.out.println("the main started");

        Boat ref = new Boat();
        //innitialize through setter
        ref.setBoatId(1);
        ref.setBoatName("Babas boat");
        ref.setBoatOwner("Baba");
        ref.setBoatType("Motor boat");
        //external refrence
        int boatId = ref.getBoatId();
        String boatName = ref.getBoatName();
        String boatOwner = ref.getBoatOwner();
        String boatType = ref.getBoatType();

        System.out.println(" the boat id is " + boatId);
        System.out.println("the boat name is" + boatName);
        System.out.println("the boat owner is" + boatOwner);
        System.out.println("the boat type is" + boatType);


        System.out.println("the main ended");

    }
}
