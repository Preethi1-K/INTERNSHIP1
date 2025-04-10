package com.xworkz.basic.milk;

import com.xworkz.basic.milk.cowmilk.CowMilk;

public class MilkRunner {
    public static void main(String args[]) {

            Milk milk = new Milk();
            milk.nutrition();
            milk.source();

            CowMilk cowMilk = new CowMilk();
            cowMilk.nutrition();
            cowMilk.source();
        }
    }



