package com.xworkz.basic.icecream;
import com.xworkz.basic.icecream.cone.Cone;
public class IceCreamRunner {
    public static void main(String args[]) {

            IceCream icecream = new  Cone();
             Cone cone =(Cone)icecream;
             icecream.sweet();
             cone.sweet();


        }
    }


