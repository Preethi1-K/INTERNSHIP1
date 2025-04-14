package com.xworkz.basic.organ;

import com.xworkz.basic.organ.heart.Heart;

public class OrganRunner
{
   public static  void main(String arg[])
   {
       Organ bodyPart = new Heart();
       Heart part =  (Heart)bodyPart;
       bodyPart.Structure();
       bodyPart.InternalPart();
       part.Structure();
       part.InternalPart();
   }
}
