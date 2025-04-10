package com.xworkz.basic.institute;

import com.xworkz.basic.institute.xworkz.Xworkz;

public class InstituteRunner
{
    public static void main(String arg[]) {

        Institute aquire = new Institute();
        aquire.center();
        aquire.trainingCenter();
        Xworkz provide = new Xworkz();
        provide.center();
        provide.trainingCenter();
    }
}
