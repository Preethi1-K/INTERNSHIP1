package com.xworkz.tostring;

import com.xworkz.tostring.toString.Window;

public class WindowRunner {
    public static void main(String[] args) {
        Window window = new Window();
        window.setMaterial("Glass");
        window.setColor("Transparent");
        window.setHeight(4.0);
        window.setWidth(6.0);
        window.setType("Sliding");

        System.out.println(window.toString());
    }
}
