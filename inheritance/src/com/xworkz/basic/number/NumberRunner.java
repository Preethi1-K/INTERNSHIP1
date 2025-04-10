package com.xworkz.basic.number;

import com.xworkz.basic.number.even.EvenNumber;

public class NumberRunner
{

    public static void main(String[] args) {

        Number number = new Number();
        number.count();
        number.type();

        EvenNumber evenNumber = new EvenNumber();
        evenNumber.count();
        evenNumber.type();
    }
}
