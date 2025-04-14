package com.xworkz.basic.food;

import com.xworkz.basic.food.snacks.Snacks;
import com.xworkz.basic.hospital.patient.Patient;

public class FoodRunner {
    public static void main(String arg[]) {

        Food getting = new Snacks();
        Snacks taking =  (Snacks)getting;
        getting.foods();
        taking.snacks();

    }
}
