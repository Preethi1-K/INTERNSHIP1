package com.xworkz.basic.coffee;
import com.xworkz.basic.coffee.coldCoffee.ColdCoffee;


public class CoffeeRunner {

    public static void main(String[] args) {

            Coffee coffee = new ColdCoffee();
            ColdCoffee taste=(ColdCoffee)coffee;
            taste.energyBooster();
            coffee. taste();

        }
    }


