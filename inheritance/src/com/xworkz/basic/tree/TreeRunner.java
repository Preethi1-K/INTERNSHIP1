package com.xworkz.basic.tree;

import com.xworkz.basic.tree.birds.Birds;

public class TreeRunner {
    public static  void main(String arg[]) {
        Tree branch = new Tree();
        {
            branch.tree();
            branch.bird();
        }
        Birds house = new Birds();
        {
            house.tree();
            house.bird();
        }

    }
}

