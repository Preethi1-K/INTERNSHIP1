package com.xworkz.tostring;

import com.xworkz.tostring.toString.Gym;

public class GymRunner {
    public static void main(String[] args) {
        Gym gym = new Gym();
        gym.setName("Iron Temple");
        gym.setTrainer("Ravi Bhai");
        gym.setMembers(300);
        gym.setIsOpen24Hours(true);

        System.out.println(gym.toString());
    }
}
