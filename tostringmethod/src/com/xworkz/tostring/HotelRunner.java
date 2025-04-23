package com.xworkz.tostring;

import com.xworkz.tostring.toString.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.setName("Taj Mahal Palace");
        hotel.setLocation("Mumbai");
        hotel.setRating(5);
        hotel.setPricePerNight(15000.50);

        System.out.println(hotel.toString());
    }
}
