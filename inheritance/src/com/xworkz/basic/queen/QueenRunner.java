package com.xworkz.basic.queen;

import com.xworkz.basic.queen.princess.Princess;

public class QueenRunner {

    public static void main(String args[]) {

        Queen queen = new Queen();
        queen.rule();
        queen.dressCode();

        Princess princess = new Princess();
        princess.rule();
        princess.dressCode();
    }
}
