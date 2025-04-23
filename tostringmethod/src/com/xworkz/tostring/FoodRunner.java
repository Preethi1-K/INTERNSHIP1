package com.xworkz.tostring;

import com.xworkz.tostring.toString.Food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Food();
        food.setName("Paneer Butter Masala");
        food.setCuisine("Indian");
        food.setVegetarian(true);
        food.setPrice(220.0);

        System.out.println(food.toString());
    }
}
