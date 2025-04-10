package com.xworkz.basic.happiness;

import com.xworkz.basic.happiness.stateOfMind.SateOfMind;

public class HappinessRunner {
    public static void main(String arg[])
    {
        Happiness happiness=new Happiness();
        happiness.goodHealth();
        happiness.wealth();

        SateOfMind things=new SateOfMind();
        things.goodHealth();
        things.wealth();


    }


}
