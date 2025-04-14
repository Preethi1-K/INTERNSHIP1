package com.xworkz.basic.matter;

import com.xworkz.basic.matter.liquid.Liquid;

public class MatterRunner {
    public static void main(String arg[])
    {
        Matter havings =  new Liquid();
        Liquid takking =  (Liquid)havings;

            havings.matter();
            havings.liquid();
            takking.matter();
            takking.liquid();

}
}
