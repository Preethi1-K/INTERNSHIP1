package com.xworkz.basic.fish;

import com.xworkz.basic.fish.shark.Shark;

public class FishRunner {

    public static void main(String args[]) {
        Fish fish = new Fish();
        fish.swim();
        fish.layEggs();

        Shark shark = new Shark();
        shark.swim();
        shark.layEggs();
    }
}
