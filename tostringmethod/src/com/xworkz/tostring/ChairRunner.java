package com.xworkz.tostring;

import com.xworkz.tostring.toString.Chair;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.setMaterial("Plastic");
        chair.setColor("Black");
        chair.setHeight(1.2);
        chair.setType("Office");
        chair.setIsReclining(true);

        System.out.println(chair.toString());
    }
}
