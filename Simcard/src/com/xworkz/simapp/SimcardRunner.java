package com.xworkz.simapp;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import com.xworkz.simapp.simcard.Simcard;
import sun.awt.geom.AreaOp;

public class SimcardRunner {

    public static void main(String[] args)
    {

            Simcard sim1 = new Simcard();
            sim1.setNetworkProvider("Jio");
            sim1.setSimType("Prepaid");
            sim1.setNumber("9876543210");
            sim1.setBalance(199.50);
            sim1.setIsActive(true);
            sim1.setValidity("28 Days");
            sim1.setCustomerName("Rahul");



       String provider1= sim1.getNetworkProvider();
       String type1= sim1.getSimType();
       String number1= sim1.getNumber();
       double balance1= sim1.getBalance();
       boolean state1= sim1.getIsActive();
        String validity1=sim1.getValidity();
       String custemername1= sim1.getCustomerName();


       System.out.println("The sim provider name is"+provider1);
       System.out.println("The sim type is"+type1);
       System.out.println("The sim number is"+number1);
       System.out.println("The sim balance is"+balance1);
       System.out.println("The sim condition is"+state1);
       System.out.println("The sim validity is"+validity1);
       System.out.println("The owner of sim is"+custemername1);
       System.out.println("\n");


        Simcard sim2 = new Simcard();
            sim2.setNetworkProvider("Airtel");
            sim2.setSimType("Postpaid");
            sim2.setNumber("9123456780");
            sim2.setBalance(500.00);
            sim2.setIsActive(true);
            sim2.setValidity("1 Month");
            sim2.setCustomerName("Sneha");



        String provider2= sim2.getNetworkProvider();
        String type2= sim2.getSimType();
        String number2= sim2.getNumber();
        double balance2= sim2.getBalance();
        boolean state2= sim2.getIsActive();
        String validity2=sim2.getValidity();
        String custemername2= sim2.getCustomerName();
        System.out.println("\n");


        System.out.println("The sim provider name is"+provider2);
        System.out.println("The sim type is"+type2);
        System.out.println("The sim number is"+number2);
        System.out.println("The sim balance is"+balance2);
        System.out.println("The sim condition is"+state2);
        System.out.println("The sim validity is"+validity2);
        System.out.println("The owner of sim is"+custemername2);
        System.out.println("\n");

            Simcard sim3 = new Simcard();
            sim3.setNetworkProvider("Vi");
            sim3.setSimType("Prepaid");
            sim3.setNumber("9988776655");
            sim3.setBalance(120.75);
            sim3.setIsActive(false);
            sim3.setValidity("15 Days");
            sim3.setCustomerName("Arjun");



        String provider3= sim3.getNetworkProvider();
        String type3= sim3.getSimType();
        String number3= sim3.getNumber();
        double balance3= sim3.getBalance();
        boolean state3= sim3.getIsActive();
        String validity3=sim3.getValidity();
        String custemername3= sim3.getCustomerName();


        System.out.println("The sim provider name is"+provider3);
        System.out.println("The sim type is"+type3);
        System.out.println("The sim number is"+number3);
        System.out.println("The sim balance is"+balance3);
        System.out.println("The sim condition is"+state3);
        System.out.println("The sim validity is"+validity3);
        System.out.println("The owner of sim is"+custemername3);
        System.out.println("\n");

            Simcard sim4 = new Simcard();
            sim4.setNetworkProvider("BSNL");
            sim4.setSimType("Prepaid");
            sim4.setNumber("9876512345");
            sim4.setBalance(75.00);
            sim4.setIsActive(true);
            sim4.setValidity("30 Days");
            sim4.setCustomerName("Divya");


        String provider4= sim4.getNetworkProvider();
        String type4= sim4.getSimType();
        String number4= sim4.getNumber();
        double balance4= sim4.getBalance();
        boolean state4= sim4.getIsActive();
        String validity4=sim4.getValidity();
        String custemername4= sim4.getCustomerName();


        System.out.println("The sim provider name is"+provider4);
        System.out.println("The sim type is"+type4);
        System.out.println("The sim number is"+number4);
        System.out.println("The sim balance is"+balance4);
        System.out.println("The sim condition is"+state4);
        System.out.println("The sim validity is"+validity4);
        System.out.println("The owner of sim is"+custemername4);
        System.out.println("\n");

            Simcard sim5 = new Simcard();
            sim5.setNetworkProvider("Jio");
            sim5.setSimType("Postpaid");
            sim5.setNumber("9090909090");
            sim5.setBalance(1000.00);
            sim5.setIsActive(false);
            sim5.setValidity("1 Year");
            sim5.setCustomerName("Kiran");



        String provider5= sim5.getNetworkProvider();
        String type5= sim5.getSimType();
        String number5= sim5.getNumber();
        double balance5= sim5.getBalance();
        boolean state5= sim5.getIsActive();
        String validity5=sim5.getValidity();
        String custemername5= sim5.getCustomerName();


        System.out.println("The sim provider name is"+provider5);
        System.out.println("The sim type is"+type5);
        System.out.println("The sim number is"+number5);
        System.out.println("The sim balance is"+balance5);
        System.out.println("The sim condition is"+state5);
        System.out.println("The sim validity is"+validity5);
        System.out.println("The owner of sim is"+custemername5);
        System.out.println("\n");


    }

}
