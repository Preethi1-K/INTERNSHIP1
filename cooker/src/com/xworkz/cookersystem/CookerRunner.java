package com.xworkz.cookersystem;
import com.xworkz.cookersystem.cookerapp.Cooker;

public class CookerRunner {


   public  static void main(String arg[])
   {
      System.out.println("the main started");

      Cooker stove =new Cooker();

      stove.setBrand("Prestige");
      stove.setModel("Pic 20");
      stove.setColor("White");
      stove.setCapacity("3 liter");
      stove.setPower("1600w");
      stove.setIselectric(true);
      stove.setPrice(999.0);


      String brand1 = stove.getBrand();
      String model1= stove.getModel();
      String color1 = stove.getColor();
      String capacity1= stove.getCapacity();
      String power= stove.getPower();
      boolean iselectricornot= stove.getIselectric();
      double price=stove.getPrice();


      System.out.println("The cooker brand is"+brand1);
      System.out.println("The cooker model is " +model1);
      System.out.println("The cooker color  is" + color1);
      System.out.println("The cooker capacity  is" + capacity1);
      System.out.println("The cooker power  is" +power );
      System.out.println("the cokker is electric or not"+iselectricornot);
      System.out.println("the cokker  price is"+price);

      System.out.println("\n");

      Cooker oven =new Cooker();

      oven.setBrand("Panasonic");
      oven.setModel("SR-WA22H");
      oven.setColor("red");
      oven.setCapacity("2.2 Liters");
      oven.setPower("750W");
      oven.setIselectric(true);
      oven.setPrice(900.0);


      String brand2 = oven.getBrand();
      String model2= oven.getModel();
      String color2 = oven.getColor();
      String capacity2= oven.getCapacity();
      String power2= oven.getPower();
      boolean iselectricornot2= oven.getIselectric();
      double price2=oven.getPrice();


      System.out.println("The cooker brand is"+brand2);
      System.out.println("The cooker model is " +model2);
      System.out.println("The cooker color  is" + color2);
      System.out.println("The cooker capacity  is" + capacity2);
      System.out.println("The cooker power  is" +power2 );
      System.out.println("the cokker is electric or not"+iselectricornot2);
      System.out.println("the cokker  price is"+price2);
      System.out.println("\n");


      Cooker range =new Cooker();

      range.setBrand("Butterfly");
      range.setModel("Curve");
      range.setColor("Silver");
      range.setCapacity("3 liters");
      range.setPower("1500 watt");
      range.setIselectric(true);
      range.setPrice(1500.0);


      String brand3 = range.getBrand();
      String model3= range.getModel();
      String color3 = range.getColor();
      String capacity3= range.getCapacity();
      String power3= range.getPower();
      boolean iselectricornot3= range.getIselectric();
      double price3=range.getPrice();


      System.out.println("The cooker brand is"+brand3);
      System.out.println("The cooker model is " +model3);
      System.out.println("The cooker color  is" + color3);
      System.out.println("The cooker capacity  is" + capacity3);
      System.out.println("The cooker power  is" +power3 );
      System.out.println("the cokker is electric or not"+iselectricornot3);
      System.out.println("the cokker  price is"+price3);
      System.out.println("\n");


      Cooker burner =new Cooker();

      burner.setBrand("Philips");
      burner.setModel("HD4931");
      burner.setColor("Black");
      burner.setCapacity("5 liter");
      burner.setPower("1200w");
      burner.setIselectric(true);
      burner.setPrice(150.0);


      String brand4 = burner.getBrand();
      String model4= burner.getModel();
      String color4 = burner.getColor();
      String capacity4= burner.getCapacity();
      String power4= burner.getPower();
      boolean iselectricornot4= burner.getIselectric();
      double price4=burner.getPrice();


      System.out.println("The cooker brand is"+brand4);
      System.out.println("The cooker model is " +model4);
      System.out.println("The cooker color  is" + color4);
      System.out.println("The cooker capacity  is" + capacity4);
      System.out.println("The cooker power  is" +power4 );
      System.out.println("the cokker is electric or not"+iselectricornot4);
      System.out.println("the cokker  price is"+price4);
      System.out.println("\n");


      Cooker hotPlate =new Cooker();


      hotPlate.setBrand("Bajaj");
      hotPlate.setModel("Majesty ICX7");
      hotPlate.setColor("Black");
      hotPlate.setCapacity("2000watt");
      hotPlate.setPower("4 Liters");
      hotPlate.setIselectric(true);
      burner.setPrice(2000.0);


      String brand5 = hotPlate.getBrand();
      String model5= hotPlate.getModel();
      String color5 = hotPlate.getColor();
      String capacity5= hotPlate.getCapacity();
      String power5= hotPlate.getPower();
      boolean iselectricornot5= hotPlate.getIselectric();
      double price5=hotPlate.getPrice();


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