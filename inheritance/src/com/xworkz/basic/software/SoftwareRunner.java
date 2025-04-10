package com.xworkz.basic.software;

import com.xworkz.basic.software.application.Application;

public class SoftwareRunner {
    public static void main(String arg[])
    {
        Software software=new Software();
        software.develop();
        software.maintain();
        Application application=new Application();
        application.develop();
        application.maintain();
    }
}
