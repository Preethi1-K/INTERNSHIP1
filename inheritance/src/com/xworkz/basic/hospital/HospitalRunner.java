package com.xworkz.basic.hospital;

import com.xworkz.basic.hospital.patient.Patient;

public class HospitalRunner {
    public static void main(String arg[])
    {
        Hospital take=new Hospital();
        take.docter();
        take.nurse();
        Patient provide=new Patient();
        provide.docter();
        provide.nurse();
    }
}
