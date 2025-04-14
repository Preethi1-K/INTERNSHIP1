package com.xworkz.basic.sports;

import com.xworkz.basic.sports.football.FootBall;

public class SportRunner {
    public static void main(String arg[]) {
        Sport sports = new FootBall();
        FootBall ball = (FootBall)sports;
            sports.game();
            sports.refreher();
            ball.game();
            ball.refreher();


    }
}

