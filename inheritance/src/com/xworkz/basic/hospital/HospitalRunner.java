package com.xworkz.basic.hospital;

import com.xworkz.basic.hospital.patient.Patient;

public class HospitalRunner {
    public static void main(String arg[])
    {
        Hospital take=new Patient();
        Patient provide= (Patient) take;
        take.docter();
        take.nurse();
        provide.docter();
        provide.nurse();
    }
}
