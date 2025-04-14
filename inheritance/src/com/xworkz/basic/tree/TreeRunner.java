package com.xworkz.basic.tree;

import com.xworkz.basic.tree.birds.Birds;

public class TreeRunner {
    public static  void main(String arg[]) {
        Tree branch = new Birds();
        Birds house =  (Birds)branch;

            branch.tree();
            branch.bird();
            house.tree();
            house.bird();


    }
}

