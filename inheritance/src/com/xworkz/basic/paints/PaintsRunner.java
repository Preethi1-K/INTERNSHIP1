package com.xworkz.basic.paints;

import com.xworkz.basic.paints.walls.Walls;

public class PaintsRunner {
    public static void main(String arg[]) {


        Paints attract = new Walls() ;
        Walls views =  (Walls) attract;

        attract.paints();
        attract.walls();
        views.paints();
        views.walls();

    }
}
