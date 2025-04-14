package com.xworkz.basic.juice;

import com.xworkz.basic.juice.mangoJuice.MangoJuice;

public class JuiceRunner {

    public static void main(String args[]) {

        Juice juice = new MangoJuice();
        MangoJuice mangoJuice = new MangoJuice();
        juice.flavor();
        mangoJuice.flavor();
    }
}
