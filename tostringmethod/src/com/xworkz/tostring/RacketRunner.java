package com.xworkz.tostring;

import com.xworkz.tostring.toString.Racket;

public class RacketRunner {
    public static void main(String[] args) {
        Racket racket = new Racket();
        racket.setBrand("Yonex");
        racket.setType("Badminton");
        racket.setWeight(85.0);
        racket.setPrice(1500.0);

        System.out.println(racket.toString());
    }
}
