package com.xworkz.basic.paints;

import com.xworkz.basic.paints.walls.Walls;

public class PaintsRunner {
    public static void main(String arg[]) {


        Paints attract = new Paints() ;
        {
        attract.paints();
        attract.walls();
        }
        Walls views = new Walls() ;
        {
        views.paints();
        views.walls();
        }
    }
}
