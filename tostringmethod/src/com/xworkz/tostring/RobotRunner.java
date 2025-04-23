package com.xworkz.tostring;

import com.xworkz.tostring.toString.Robot;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setModel("RX-78");
        robot.setFunction("Security");
        robot.setBatteryLife(12);
        robot.setManufacturer("Cyberdyne Systems");

        System.out.println(robot.toString());
    }
}
