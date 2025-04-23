package com.xworkz.tostring;

import com.xworkz.tostring.toString.AC;

public class ACRunner {
    public static void main(String[] args) {
        AC ac = new AC();
        ac.setBrand("LG");
        ac.setType("Split");
        ac.setCapacity(1);
        ac.setPrice(35000.75);
        ac.setDisccount("50%");

        System.out.println(ac.toString());
    }
}
