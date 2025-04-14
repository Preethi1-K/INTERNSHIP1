package com.xworkz.basic.science;

import com.xworkz.basic.science.physics.Physics;

public class ScienceRunner {
    public static  void main(String arg[])
    {
        Science sub=new Physics();
        Physics sub1= (Physics)sub;

            sub.subject();
            sub.branch();
            sub1.subject();
            sub1.branch();

    }
}
