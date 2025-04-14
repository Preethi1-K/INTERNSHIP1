package com.xworkz.basic.calculator;

import com.xworkz.basic.calculator.scientificcalculator.ScientificCalculator;


public class CalculatorRunner {

    public static void main(String args[])
    {
        Calculator calculator = new ScientificCalculator();
        ScientificCalculator sciCalc=(ScientificCalculator)calculator;
        sciCalc.addition();
        sciCalc.subtraction();

    }
}
