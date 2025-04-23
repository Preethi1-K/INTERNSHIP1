package com.xworkz.tostring;

import com.xworkz.tostring.toString.Factory;

public class FactoryRunner {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.setName("Tata Motors");
        factory.setProduct("Cars");
        factory.setWorkers(5000);
        factory.setLocation("Pune");

        System.out.println(factory.toString());
    }
}
