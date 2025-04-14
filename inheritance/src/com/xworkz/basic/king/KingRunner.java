package com.xworkz.basic.king;

import com.xworkz.basic.king.emperor.Emperor;


public class KingRunner {

    public static void main(String args[]) {

        King king =new Emperor();
        Emperor prince =  (Emperor)king;
        king.rule();
        king.protect();
        prince.rule();
        prince.protect();
    }
}
