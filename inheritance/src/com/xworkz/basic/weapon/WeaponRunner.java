package com.xworkz.basic.weapon;

import com.xworkz.basic.weapon.gun.Gun;

public class WeaponRunner {


    public static void main(String args[]) {
        Weapon weapon = new Weapon();
        weapon.usedForWar();
        weapon.dangerous();

        Gun gun = new Gun();
        gun.usedForWar();
        gun.dangerous();
    }
}
