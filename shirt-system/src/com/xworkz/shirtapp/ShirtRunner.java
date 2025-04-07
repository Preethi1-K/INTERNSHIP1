package com.xworkz.shirtapp;
import com.xworkz.shirtapp.shirt.Shirt;


public class ShirtRunner {

    public static void main(String arg[])
    {
        System.out.println("the main started");

        Shirt ref1 = new Shirt();
        ref1.setBrand("Nike");
        ref1.setColor("Black");
        ref1.setSize("M");
        ref1.setPrice(2499.0);
        ref1.setMaterial("Cotton");
        ref1.setIslongsleeve(true);
        ref1.setPattern("Solid");

        String brand = ref1.getBrand();
        String color = ref1.getColor();
        String size = ref1.getSize();
        double  price = ref1.getPrice();
        String material = ref1.getMaterial();
        boolean sleeve = ref1.getIslongsleeve();
        String pattren = ref1.getPattern();

        System.out.println(" The  brand of shirt is" + brand);
        System.out.println("The color of shirt is" + color);
        System.out.println("The size of shirt is" + size);
        System.out.println("The price of shirt is " + price);
        System.out.println("Th material of shirt is" + material);
        System.out.println("The shirt is full sleeve or not " + sleeve);
        System.out.println("The pattren of shirt is" + pattren);
        System.out.println("/n");


        Shirt ref2 = new Shirt();

        ref2.setBrand("Adidas");
        ref2.setColor("White");
        ref2.setSize("L");
        ref2.setPrice(2799.00);
        ref2.setMaterial("Polyster");
        ref2.setIslongsleeve(false);
        ref2.setPattern("Striped");

        String brand2 = ref2.getBrand();
        String color2 = ref2.getColor();
        String size2 = ref2.getSize();
        double price2 = ref2.getPrice();
        String material2 = ref2.getMaterial();
        boolean sleeve2 = ref2.getIslongsleeve();
        String pattren2 = ref2.getPattern();

        System.out.println(" The  brand of shirt is" + brand2);
        System.out.println("The color of shirt is" + color2);
        System.out.println("The size of shirt is" + size2);
        System.out.println("The price of shirt is " + price2);
        System.out.println("Th material of shirt is" + material2);
        System.out.println("The shirt is full sleeve or not " + sleeve2);
        System.out.println("The pattren of shirt is" + pattren2);
        System.out.println("/n");


        Shirt ref3 = new Shirt();

        ref3.setBrand("Puma");
        ref3.setColor("Red");
        ref3.setSize("l");
        ref3.setPrice(1999.00);
        ref3.setMaterial("Cotton");
        ref3.setIslongsleeve(false);
        ref3.setPattern("Printed");

        String brand3 = ref3.getBrand();
        String color3 = ref3.getColor();
        String size3 = ref3.getSize();
        double  price3 = ref3.getPrice();
        String material3 = ref3.getMaterial();
        boolean sleeve3 = ref3.getIslongsleeve();
        String pattren3 = ref3.getPattern();

        System.out.println(" The  brand of shirt is" + brand3);
        System.out.println("The color of shirt is" + color3);
        System.out.println("The size of shirt is" + size3);
        System.out.println("The price of shirt is " + price3);
        System.out.println("Th material of shirt is" + material3);
        System.out.println("The shirt is full sleeve or not " + sleeve3);
        System.out.println("The pattren of shirt is" + pattren3);
        System.out.println("/n");


        Shirt ref4 = new Shirt();

        ref4.setBrand("Levi's");
        ref4.setColor("Blue");
        ref4.setSize("xl");
        ref4.setPrice(200.00);
        ref4.setMaterial("Denim");
        ref4.setIslongsleeve(false);
        ref4.setPattern("Solid");

        String brand4 = ref4.getBrand();
        String color4 = ref4.getColor();
        String size4 = ref4.getSize();
        double  price4 = ref4.getPrice();
        String material4 = ref4.getMaterial();
        boolean sleeve4 = ref4.getIslongsleeve();
        String pattren4 = ref4.getPattern();

        System.out.println(" The  brand of shirt is" + brand4);
        System.out.println("The color of shirt is" + color4);
        System.out.println("The size of shirt is" + size4);
        System.out.println("The price of shirt is " + price4);
        System.out.println("Th material of shirt is" + material4);
        System.out.println("The shirt is full sleeve or not " + sleeve4);
        System.out.println("The pattren of shirt is" + pattren4);
        System.out.println("/n");


        Shirt ref5 = new Shirt();

        ref5.setBrand("Roadstrer");
        ref5.setColor("Yellow");
        ref5.setSize("s");
        ref5.setPrice(2000.0);
        ref5.setMaterial("cotton blend ");
        ref5.setIslongsleeve(false);
        ref5.setPattern("Checked");

        String brand5 = ref5.getBrand();
        String color5 = ref5.getColor();
        String size5 = ref5.getSize();
        double price5 = ref5.getPrice();
        String material5 = ref5.getMaterial();
        boolean sleeve5 = ref5.getIslongsleeve();
        String pattren5 = ref5.getPattern();

        System.out.println(" The  brand of shirt is" + brand5);
        System.out.println("The color of shirt is" + color5);
        System.out.println("The size of shirt is" + size5);
        System.out.println("The price of shirt is " + price5);
        System.out.println("Th material of shirt is" + material5);
        System.out.println("The shirt is full sleeve or not " + sleeve5);
        System.out.println("The pattren of shirt is" + pattren5);
        System.out.println("/n");



        System.out.println("the main ended");
    }
}
