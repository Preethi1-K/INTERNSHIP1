package com.xworkz.tostring;

import com.xworkz.tostring.toString.Printer;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setBrand("HP");
        printer.setModel("LaserJet Pro");
        printer.setType("Laser");
        printer.setPrice(19999.99);

        System.out.println(printer.toString());
    }
}
