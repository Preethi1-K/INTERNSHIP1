package com.xworkz.basic.plastic;

import com.xworkz.basic.plastic.bottle.Bottle;

public class PlasticRunner {

    public static void main(String arg[])
    {
        Plastic plastic=new Bottle();
        Bottle bottle= (Bottle)plastic;
        plastic.recyle();
       plastic. nonBiodegradable();
       bottle.recyle();
       bottle.nonBiodegradable();


    }
}
