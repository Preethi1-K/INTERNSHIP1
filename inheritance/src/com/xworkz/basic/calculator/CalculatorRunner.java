package com.xworkz.basic.calculator;

import com.xworkz.basic.calculator.scientificcalculator.ScientificCalculator;


public class CalculatorRunner {

    public static void main(String args[])
    {
        Calculator calculator = new Calculator();
        calculator.addition();
        calculator.subtraction();

        ScientificCalculator sciCalc = new ScientificCalculator();
        sciCalc.addition();
        sciCalc.subtraction();

    }
}
