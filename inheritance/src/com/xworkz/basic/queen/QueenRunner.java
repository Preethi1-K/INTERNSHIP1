package com.xworkz.basic.queen;

import com.xworkz.basic.queen.princess.Princess;

public class QueenRunner {

    public static void main(String args[]) {

        Queen queen =new Princess();
        Princess princess = (Princess)queen;
        queen.rule();
        queen.dressCode();
        princess.rule();
        princess.dressCode();
    }
}
