package com.xworkz.tostring;

import com.xworkz.tostring.toString.Projector;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector = new Projector();
        projector.setBrand("Epson");
        projector.setBrightness(3000);
        projector.setWeight(2.5);
        projector.setResolution("1920x1080");
        projector.setType("LCD");

        System.out.println(projector.toString());
    }
}
