package com.xworkz.basic.fish;

import com.xworkz.basic.fish.shark.Shark;

public class FishRunner {

    public static void main(String args[]) {
        Fish fish = new Shark() ;
        Shark shark =  (Shark)fish;
        shark.swim();
        fish.layEggs();

    }
}
