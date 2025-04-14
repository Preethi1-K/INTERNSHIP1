package com.xworkz.basic.milk;

import com.xworkz.basic.milk.cowmilk.CowMilk;

public class MilkRunner {
    public static void main(String args[]) {

            Milk milk =  new CowMilk();
        CowMilk cowMilk = (CowMilk)milk;
            milk.nutrition();
            milk.source();
            cowMilk.nutrition();
            cowMilk.source();
        }
    }



