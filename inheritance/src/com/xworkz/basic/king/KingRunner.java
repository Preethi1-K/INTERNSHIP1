package com.xworkz.basic.king;

import com.xworkz.basic.king.emperor.Emperor;


public class KingRunner {

    public static void main(String args[]) {

        King king = new King();
        king.rule();
        king.protect();

        Emperor prince = new Emperor();
        prince.rule();
        prince.protect();
    }
}
