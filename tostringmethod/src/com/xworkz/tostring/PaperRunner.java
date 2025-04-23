package com.xworkz.tostring;

import com.xworkz.tostring.toString.Paper;

public class PaperRunner
{
    public static void main(String[] args) {
        Paper paper = new Paper();
        paper.setSize("A4");
        paper.setType("Glossy");
        paper.setGsm(100);
        paper.setColor("White");

        System.out.println(paper.toString());
    }
}
