package com.xworkz.chalksystem;
import com.xworkz.chalksystem.chalkapp.Chalk;

public class ChalkRunner {

    public static void main(String arg[]) {
        System.out.println("the main started");
        Chalk crayon = new Chalk();

        crayon.setColor("White");
        crayon.setBrand("Camlin");
        crayon.setMaterial("calcium carbonate");
        crayon.setLength(7.00);
        crayon.setThickness(1.0);
        crayon.setPrice(10.0);
        crayon.setIsdustless(true);


        String color = crayon.getColor();
        String brand = crayon.getBrand();
        String material = crayon.getMaterial();
        double length = crayon.getLength();
        double thickness = crayon.getThickness();
        double price = crayon.getPrice();
        boolean dutsornot = crayon.getIsdustless();

        System.out.println("The chalk color is" + color);
        System.out.println("The chalk brand  is" + brand);
        System.out.println("The chalk material is" + material);
        System.out.println("The chalk length is" + length);
        System.out.println("The chalk thickness is" + thickness);
        System.out.println("The chalk price  is" + price);
        System.out.println("The chalk dust or not is" + dutsornot);
        System.out.println("\n");


        Chalk ref2 = new Chalk();

        ref2.setColor("yellow");
        ref2.setBrand("Classmate");
        ref2.setMaterial("Gypsum");
        ref2.setLength(8.0);
        ref2.setThickness(1.3);
        ref2.setPrice(12.0);
        ref2.setIsdustless(false);


        String color2 = ref2.getColor();
        String brand2 = ref2.getBrand();
        String material2 = ref2.getMaterial();
        double length2 = ref2.getLength();
        double thickness2 = ref2.getThickness();
        double price2 = ref2.getPrice();
        boolean dutsornot2 = ref2.getIsdustless();

        System.out.println("The chalk color is" + color2);
        System.out.println("The chalk brand  is" + brand2);
        System.out.println("The chalk material is" + material2);
        System.out.println("The chalk length is" + length2);
        System.out.println("The chalk thickness is" + thickness2);
        System.out.println("The chalk price  is" + price2);
        System.out.println("The chalk dust or not is" + dutsornot2);
        System.out.println("\n");


        Chalk gyspsum = new Chalk();

        gyspsum.setColor("Green");
        gyspsum.setBrand("Apsara");
        gyspsum.setMaterial("calsium sulphate");
        gyspsum.setLength(6.0);
        gyspsum.setThickness(0.8);
        gyspsum.setPrice(8);
        gyspsum.setIsdustless(true);


        String color3 = gyspsum.getColor();
        String brand3 = gyspsum.getBrand();
        String material3 = gyspsum.getMaterial();
        double length3 = gyspsum.getLength();
        double thickness3 = gyspsum.getThickness();
        double price3 = gyspsum.getPrice();
        boolean dutsornot3 = gyspsum.getIsdustless();

        System.out.println("The chalk color is" + color3);
        System.out.println("The chalk brand  is" + brand3);
        System.out.println("The chalk material is" + material3);
        System.out.println("The chalk length is" + length3);
        System.out.println("The chalk thickness is" + thickness3);
        System.out.println("The chalk price  is" + price3);
        System.out.println("The chalk dust or not is" + dutsornot3);
        System.out.println("\n");


        Chalk ref4 = new Chalk();

        ref4.setColor("pink");
        ref4.setBrand("Natraj");
        ref4.setMaterial("Calcium Carbonate");
        ref4.setLength(7.5);
        ref4.setThickness(1.0);
        ref4.setPrice(3.0);
        ref4.setIsdustless(false);


        String color4 = ref4.getColor();
        String brand4 = ref4.getBrand();
        String material4 = ref4.getMaterial();
        double length4 = ref4.getLength();
        double thickness4 = ref4.getThickness();
        double price4 = ref4.getPrice();
        boolean dutsornot4 = ref4.getIsdustless();

        System.out.println("The chalk color is" + color4);
        System.out.println("The chalk brand  is" + brand4);
        System.out.println("The chalk material is" + material4);
        System.out.println("The chalk length is" + length4);
        System.out.println("The chalk thickness is" + thickness4);
        System.out.println("The chalk price  is" + price4);
        System.out.println("The chalk dust or not is" + dutsornot4);
        System.out.println("\n");


        Chalk whiting = new Chalk();

        whiting.setColor("Blue");
        whiting.setBrand("Renolds");
        whiting.setMaterial("Gypsum");
        whiting.setLength(9.0);
        whiting.setThickness(1.0);
        whiting.setPrice(14.0);
        whiting.setIsdustless(true);


        String color5 = whiting.getColor();
        String brand5 = whiting.getBrand();
        String material5 = whiting.getMaterial();
        double length5 = whiting.getLength();
        double thickness5 = whiting.getThickness();
        double price5 = whiting.getPrice();
        boolean dutsornot5 = whiting.getIsdustless();

        System.out.println("The chalk color is" + color5);
        System.out.println("The chalk brand  is" + brand5);
        System.out.println("The chalk material is" + material5);
        System.out.println("The chalk length is" + length5);
        System.out.println("The chalk thickness is" + thickness5);
        System.out.println("The chalk price  is" + price5);
        System.out.println("The chalk dust or not is" + dutsornot5);
        System.out.println("\n");


        System.out.println("the main ended");
    }
}