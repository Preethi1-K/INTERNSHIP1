package com.xworkz.basic.juice;

import com.xworkz.basic.juice.mangoJuice.MangoJuice;

public class JuiceRunner {

    public static void main(String args[]) {

        Juice juice = new Juice();
        juice.drink();
        juice.flavor();

        MangoJuice mangoJuice = new MangoJuice();
        mangoJuice.drink();
        mangoJuice.flavor();
    }
}
