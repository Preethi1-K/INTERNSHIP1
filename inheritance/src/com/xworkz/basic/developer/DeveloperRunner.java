package com.xworkz.basic.developer;
import com.xworkz.basic.developer.backend.BackendDeveloper;

public class DeveloperRunner {


    public static void main(String args[]) {

        Developer developer = new Developer();
        developer.coding();
        developer.testing();

        BackendDeveloper backend = new BackendDeveloper();
        backend.coding();
        backend.testing();
    }
}
