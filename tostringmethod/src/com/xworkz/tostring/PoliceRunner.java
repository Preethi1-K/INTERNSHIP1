package com.xworkz.tostring;

import com.xworkz.tostring.toString.Police;

public class PoliceRunner {
    public static void main(String[] args) {
        Police police = new Police();
        police.setName("John Doe");
        police.setRank("Sergeant");
        police.setBadgeNumber("12345");
        police.setDepartment("Los Angeles Police Department");

        System.out.println(police.toString());
    }
}
