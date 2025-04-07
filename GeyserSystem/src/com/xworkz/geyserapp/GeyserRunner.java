package com.xworkz.geyserapp;
import com.xworkz.geyserapp.geyser.Geyser;

public class GeyserRunner{

public  static void main(String arg[])
{
    System.out.println("the main started");

    Geyser waterHeater =new Geyser();

    waterHeater.setBrand("Bajaj");
    waterHeater.setModel("New Shakti");
    waterHeater.setColor("White");
    waterHeater.setCapacity("15 liter");
    waterHeater.setPower("500w");
    waterHeater.setIselectric(true);
    waterHeater.setPrice(9999.0);


    String brand1 = waterHeater.getBrand();
    String model1= waterHeater.getModel();
    String color1 = waterHeater.getColor();
    String capacity1= waterHeater.getCapacity();
    String power= waterHeater.getPower();
    boolean iselectricornot= waterHeater.getIselectric();
    double price=waterHeater.getPrice();


    System.out.println("The cooker brand is"+brand1);
    System.out.println("The cooker model is " +model1);
    System.out.println("The cooker color  is" + color1);
    System.out.println("The cooker capacity  is" + capacity1);
    System.out.println("The cooker power  is" +power );
    System.out.println("the cokker is electric or not"+iselectricornot);
    System.out.println("the cokker  price is"+price);

    System.out.println("\n");

    Geyser boiler =new Geyser();

    boiler.setBrand("AO Smith");
    boiler.setModel("HSE-SDS-15");
    boiler.setColor("red");
    boiler.setCapacity("20 Liters");
    boiler.setPower("750W");
    boiler.setIselectric(true);
    boiler.setPrice(9090.0);


    String brand2 = boiler.getBrand();
    String model2= boiler.getModel();
    String color2 = boiler.getColor();
    String capacity2= boiler.getCapacity();
    String power2= boiler.getPower();
    boolean iselectricornot2= boiler.getIselectric();
    double price2=boiler.getPrice();


    System.out.println("The cooker brand is"+brand2);
    System.out.println("The cooker model is " +model2);
    System.out.println("The cooker color  is" + color2);
    System.out.println("The cooker capacity  is" + capacity2);
    System.out.println("The cooker power  is" +power2 );
    System.out.println("the cokker is electric or not"+iselectricornot2);
    System.out.println("the cokker  price is"+price2);
    System.out.println("\n");


    Geyser electricHeater =new Geyser();

    electricHeater.setBrand("Havells");
    electricHeater.setModel("Monza EC");
    electricHeater.setColor("Silver");
    electricHeater.setCapacity("30 liters");
    electricHeater.setPower("1500 watt");
    electricHeater.setIselectric(true);
    electricHeater.setPrice(20000.0);


    String brand3 = electricHeater.getBrand();
    String model3= electricHeater.getModel();
    String color3 = electricHeater.getColor();
    String capacity3= electricHeater.getCapacity();
    String power3= electricHeater.getPower();
    boolean iselectricornot3= electricHeater.getIselectric();
    double price3=electricHeater.getPrice();


    System.out.println("The cooker brand is"+brand3);
    System.out.println("The cooker model is " +model3);
    System.out.println("The cooker color  is" + color3);
    System.out.println("The cooker capacity  is" + capacity3);
    System.out.println("The cooker power  is" +power3 );
    System.out.println("the cokker is electric or not"+iselectricornot3);
    System.out.println("the cokker  price is"+price3);
    System.out.println("\n");


    Geyser hotwatertanker =new Geyser();

    hotwatertanker.setBrand("Crompton");
    hotwatertanker.setModel("Amica ASWH\"");
    hotwatertanker.setColor("Black");
    hotwatertanker.setCapacity("15 liter");
    hotwatertanker.setPower("1200w");
    hotwatertanker.setIselectric(true);
    hotwatertanker.setPrice(15000.0);


    String brand4 = hotwatertanker.getBrand();
    String model4= hotwatertanker.getModel();
    String color4 = hotwatertanker.getColor();
    String capacity4= hotwatertanker.getCapacity();
    String power4= hotwatertanker.getPower();
    boolean iselectricornot4=hotwatertanker.getIselectric();
    double price4=hotwatertanker.getPrice();


    System.out.println("The cooker brand is"+brand4);
    System.out.println("The cooker model is " +model4);
    System.out.println("The cooker color  is" + color4);
    System.out.println("The cooker capacity  is" + capacity4);
    System.out.println("The cooker power  is" +power4 );
    System.out.println("the cokker is electric or not"+iselectricornot4);
    System.out.println("the cokker  price is"+price4);
    System.out.println("\n");


    Geyser gasHeater =new Geyser();


    gasHeater.setBrand("V-Guard");
    gasHeater.setModel("Majesty ICX7");
    gasHeater.setColor("Ivory");
    gasHeater.setCapacity("2000watt");
    gasHeater.setPower(" 20 Liters");
    gasHeater.setIselectric(true);
    gasHeater.setPrice(20000.0);


    String brand5 = gasHeater.getBrand();
    String model5= gasHeater.getModel();
    String color5 = gasHeater.getColor();
    String capacity5= gasHeater.getCapacity();
    String power5= gasHeater.getPower();
    boolean iselectricornot5= gasHeater.getIselectric();
    double price5=gasHeater.getPrice();


    System.out.println("The cooker brand is"+brand5);
    System.out.println("The cooker model is " +model5);
    System.out.println("The cooker color  is" + color5);
    System.out.println("The cooker capacity  is" + capacity5);
    System.out.println("The cooker power  is" +power5 );
    System.out.println("the cokker is electric or not"+iselectricornot5);
    System.out.println("the cokker  price is"+price5);
    System.out.println("\n");





}
}

