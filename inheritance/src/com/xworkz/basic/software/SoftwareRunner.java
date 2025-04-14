package com.xworkz.basic.software;

import com.xworkz.basic.software.application.Application;

public class SoftwareRunner {
    public static void main(String arg[])
    {
        Software software=new Application();
        Application application= (Application)software;
        software.develop();
        software.maintain();
        application.develop();
        application.maintain();
    }
}
