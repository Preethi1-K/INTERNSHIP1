package com.xworkz.basic.fruit;

import com.xworkz.basic.fruit.apple.Apple;

public class FruitRunner
{
    public static void main(String arg[]) {


        Fruit gives = new  Apple();
        Apple avoid =  (Apple)gives;
        gives.fruit2();
        avoid.fruit1();

    }
}
