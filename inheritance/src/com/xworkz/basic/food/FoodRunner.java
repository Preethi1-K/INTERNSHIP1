package com.xworkz.basic.food;

import com.xworkz.basic.food.snacks.Snacks;
import com.xworkz.basic.hospital.patient.Patient;

public class FoodRunner {
    public static void main(String arg[]) {

        Food getting = new Food();
        getting.foods();
        getting.snacks();

        Snacks taking = new Snacks();
        {
            taking.foods();
            taking.snacks();
        }
    }
}
