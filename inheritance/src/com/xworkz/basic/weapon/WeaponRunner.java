package com.xworkz.basic.weapon;

import com.xworkz.basic.weapon.gun.Gun;

public class WeaponRunner {


    public static void main(String args[]) {
        Weapon weapon = new Gun();
        Gun gun = (Gun)weapon;
        weapon.usedForWar();
        weapon.dangerous();
        gun.usedForWar();
        gun.dangerous();
    }
}
