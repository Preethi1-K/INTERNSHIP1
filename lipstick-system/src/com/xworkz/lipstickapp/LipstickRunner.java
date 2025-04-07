package com.xworkz.lipstickapp;

import com.xworkz.lipstickapp.lipstick.LipsStick;

public class LipstickRunner
{
    public static void main(String arg[])
    {
        System.out.println("the main started");

        LipsStick ref1 = new LipsStick();

        ref1.setLipsStickId(1);
        ref1.setLipsStickBrand("LAKME");
        ref1.setLipsStickColor("red");
        ref1.setLipsStickPrice(100);
        ref1.setLipsStickMFD("01/09/2024");


        int lipsStickId1 = ref1.getLipsStickId();
        String brand1 = ref1.getLipsStickBrand();
        String color1 = ref1.getLipsStickColor();
        int price1 = ref1.getLipsStickPrice();
        String MFD1=ref1.getLipsStickMFD();

        System.out.println(" the lipsstick id is " + lipsStickId1);
        System.out.println("the lipsStick brand is is" +brand1);
        System.out.println("the lips stick color  is" + color1);
        System.out.println("the lipsStick price  is" + price1);
        System.out.println("the lipsStick MFD is"+MFD1);
        System.out.println("\n");


        LipsStick ref2 = new LipsStick();

        ref2.setLipsStickId(2);
        ref2.setLipsStickBrand("Mac");
        ref2.setLipsStickColor("gray");
        ref2.setLipsStickPrice(190);
        ref2.setLipsStickMFD("03/04/2025");


        int lipsStickId2 = ref2.getLipsStickId();
        String brand2 = ref2.getLipsStickBrand();
        String color2 = ref2.getLipsStickColor();
        int price2 = ref2.getLipsStickPrice();
        String MFD2=ref2.getLipsStickMFD();

        System.out.println(" the lipsstick id is " + lipsStickId2);
        System.out.println("the lipsStick brand is is" +brand2);
        System.out.println("the lips stick color  is" + color2);
        System.out.println("the lipsStick price  is" + price2);
        System.out.println("the lipsStick MFD is"+MFD2);
        System.out.println("\n");


        LipsStick ref3 = new LipsStick();

        ref3.setLipsStickId(3);
        ref3.setLipsStickBrand("");
        ref3.setLipsStickColor("dark red");
        ref3.setLipsStickPrice(290);
        ref3.setLipsStickMFD("04/03/2025");


        int lipsStickId3 = ref3.getLipsStickId();
        String brand3 = ref3.getLipsStickBrand();
        String color3 = ref3.getLipsStickColor();
        int price3= ref3.getLipsStickPrice();
        String MFD3=ref3.getLipsStickMFD();

        System.out.println(" the lipsstick id is " + lipsStickId3);
        System.out.println("the lipsStick brand is is" +brand3);
        System.out.println("the lips stick color  is" + color3);
        System.out.println("the lipsStick price  is" + price3);
        System.out.println("the lipsStick MFD is"+MFD3);
        System.out.println("\n");


        LipsStick ref4= new LipsStick();

        ref4.setLipsStickId(4);
        ref4.setLipsStickBrand("lorea");
        ref4.setLipsStickColor("red");
        ref4.setLipsStickPrice(90);
        ref4.setLipsStickMFD("09/02/2025");


        int lipsStickId4 = ref4.getLipsStickId();
        String brand4 = ref4.getLipsStickBrand();
        String color4 = ref4.getLipsStickColor();
        int price4 = ref4.getLipsStickPrice();
        String MFD4=ref4.getLipsStickMFD();

        System.out.println(" the lipsstick id is " + lipsStickId4);
        System.out.println("the lipsStick brand is is" +brand4);
        System.out.println("the lips stick color  is" + color4);
        System.out.println("the lipsStick price  is" + price4);
        System.out.println("the lipsStick MFD is"+MFD4);
        System.out.println("\n");


        LipsStick ref5= new LipsStick();

        ref5.setLipsStickId(5);
        ref5.setLipsStickBrand("Nyka");
        ref5.setLipsStickColor("dark gray");
        ref5.setLipsStickPrice(100);
        ref5.setLipsStickMFD("03/03/2025");


        int lipsStickId5= ref5.getLipsStickId();
        String brand5 = ref5.getLipsStickBrand();
        String color5 = ref5.getLipsStickColor();
        int price5 = ref5.getLipsStickPrice();
        String MFD5=ref5.getLipsStickMFD();

        System.out.println(" the lipsstick id is " + lipsStickId5);
        System.out.println("the lipsStick brand is is" +brand5);
        System.out.println("the lips stick color  is" + color5);
        System.out.println("the lipsStick price  is" + price5);
        System.out.println("the lipsStick MFD is"+MFD5);
        System.out.println("\n");


        LipsStick ref6= new LipsStick();

        ref6.setLipsStickId(6);
        ref6.setLipsStickBrand("MamaEarth");
        ref6.setLipsStickColor("blush");
        ref6.setLipsStickPrice(200);
        ref6.setLipsStickMFD("04/04/2025");


        int lipsStickId6= ref6.getLipsStickId();
        String brand6 = ref6.getLipsStickBrand();
        String color6 = ref6.getLipsStickColor();
        int price6 = ref6.getLipsStickPrice();
        String MFD6 =ref6.getLipsStickMFD();

        System.out.println(" the lipsstick id is " + lipsStickId6);
        System.out.println("the lipsStick brand is is" +brand6);
        System.out.println("the lips stick color  is" + color6);
        System.out.println("the lipsStick price  is" + price6);
        System.out.println("the lipsStick MFD is"+MFD6);
        System.out.println("\n");


        LipsStick ref7= new LipsStick();

        ref7.setLipsStickId(7);
        ref7.setLipsStickBrand("Huda beauty");
        ref7.setLipsStickColor("dark pink");
        ref7.setLipsStickPrice(100);
        ref7.setLipsStickMFD("05/05/2025");


        int id = ref7.getLipsStickId();
        String brandname = ref7.getLipsStickBrand();
        String lipsStickcolor = ref7.getLipsStickColor();
        int priceofbrand = ref7.getLipsStickPrice();
        String lipsStickMFD=ref7.getLipsStickMFD();

        System.out.println(" the lipsstick id is " + id);
        System.out.println("the lipsStick brand is is" +brandname);
        System.out.println("the lips stick color  is" + lipsStickcolor);
        System.out.println("the lipsStick price  is" + priceofbrand);
        System.out.println("the lipsStick MFD is"+lipsStickMFD);
        System.out.println("\n");

        System.out.println("the main ended");
}
}
