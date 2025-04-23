package com.xworkz.tostring;

import com.xworkz.tostring.toString.SimpleGuiApp;

public class SimpleGuiAppRunner {
    public static void main(String[] args) {
        SimpleGuiApp app = new SimpleGuiApp();
        app.setName("MyNotes");
        app.setVersion("2.1");
        app.setFramework("JavaFX");
        app.setDeveloper("Baba Inc.");

        System.out.println(app.toString());
    }
}
