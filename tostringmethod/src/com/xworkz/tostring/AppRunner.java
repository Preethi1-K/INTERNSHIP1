package com.xworkz.tostring;

import com.xworkz.tostring.toString.App;

public class AppRunner {
    public static void main(String[] args) {
        App app = new App();
        app.setName("ChatGPT");
        app.setVersion("1.0.5");
        app.setDeveloper("OpenAI");
        app.setSize(150.75);

        System.out.println(app.toString());
    }
}
