package com.xworkz.tostring;

import com.xworkz.tostring.toString.Weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setName("AK-47");
        weapon.setType("Assault Rifle");
        weapon.setWeight(4.3);
        weapon.setManufacturer("Kalashnikov Concern");

        System.out.println(weapon.toString());
    }
}
