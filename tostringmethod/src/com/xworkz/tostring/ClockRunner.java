package com.xworkz.tostring;

import com.xworkz.tostring.toString.Clock;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setBrand("Casio");
        clock.setType("Digital");
        clock.setColor("Black");
        clock.setPrice(3000.0);

        System.out.println(clock.toString());
    }
}
