package com.xworkz.basic.developer;
import com.xworkz.basic.developer.backend.BackendDeveloper;

public class DeveloperRunner {


    public static void main(String args[]) {

        Developer developer = new BackendDeveloper();
        BackendDeveloper backend = (BackendDeveloper) developer;
        developer.coding();
        backend.coding();

    }
}
