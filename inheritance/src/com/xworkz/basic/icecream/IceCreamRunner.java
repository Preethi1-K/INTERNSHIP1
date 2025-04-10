package com.xworkz.basic.icecream;
import com.xworkz.basic.icecream.cone.Cone;
public class IceCreamRunner {
    public static void main(String args[]) {

            IceCream icecream = new IceCream();
            icecream.sweet();
            icecream.cold();

            Cone cone = new Cone();
            cone.sweet();
            cone.cold();

        }
    }


