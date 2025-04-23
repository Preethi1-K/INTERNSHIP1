package com.xworkz.tostring;

import com.xworkz.tostring.toString.File;

public class FileRunner {
    public static void main(String[] args) {
        File file = new File();
        file.setName("Resume");
        file.setExtension(".pdf");
        file.setSize(0.45);
        file.setLocation("D:/Documents");

        System.out.println(file.toString());
    }
}
