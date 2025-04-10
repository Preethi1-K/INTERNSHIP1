package com.xworkz.basic.matter;

import com.xworkz.basic.matter.liquid.Liquid;

public class MatterRunner {
    public static void main(String arg[]) {
        Matter havings = new Matter();
        {
            havings.matter();
            havings.liquid();
        }
        Liquid takking = new Liquid();
        {
            takking.matter();
            takking.liquid();
        }

    }
}
