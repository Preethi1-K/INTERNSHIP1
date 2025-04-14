package com.xworkz.basic.institute;

import com.xworkz.basic.institute.xworkz.Xworkz;

public class InstituteRunner
{
    public static void main(String arg[]) {

        Institute aquire = new Xworkz();
        Xworkz provide =  (Xworkz)aquire;
        aquire.center();
        aquire.trainingCenter();
        provide.center();
        provide.trainingCenter();
    }
}
