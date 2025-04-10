package com.xworkz.basic.science;

import com.xworkz.basic.science.physics.Physics;

public class ScienceRunner {
    public static  void main(String arg[])
    {
        Science sub=new Science();
        {
            sub.subject();
            sub.branch();
        }
        Physics sub1=new Physics();
        {
            sub1.subject();
            sub1.branch();
        }
    }
}
