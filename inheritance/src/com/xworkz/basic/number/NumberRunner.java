package com.xworkz.basic.number;

import com.xworkz.basic.number.even.EvenNumber;

public class NumberRunner
{

    public static void main(String[] args) {

        Number number =  new EvenNumber();
        EvenNumber evenNumber = (EvenNumber) number;
        number.count();
        number.type();
        evenNumber.count();
        evenNumber.type();
    }
}
