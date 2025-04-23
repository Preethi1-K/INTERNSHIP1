package com.xworkz.tostring;

import com.xworkz.tostring.toString.Road;

public class RoadRunner {
    public static void main(String[] args) {
        Road road = new Road();
        road.setName("Main Street");
        road.setLocation("Downtown");
        road.setLength(3);
        road.setType("Asphalt");
        road.setCondition("Good");

        System.out.println(road.toString());
    }
}
