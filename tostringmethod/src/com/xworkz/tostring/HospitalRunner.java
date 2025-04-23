package com.xworkz.tostring;

import com.xworkz.tostring.toString.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.setName("Apollo Hospitals");
        hospital.setLocation("Chennai");
        hospital.setTotalBeds(500);
        hospital.setSpecialty("Cardiology");

        System.out.println(hospital.toString());
    }
}
