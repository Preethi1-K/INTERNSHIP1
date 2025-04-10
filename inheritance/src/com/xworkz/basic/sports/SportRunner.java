package com.xworkz.basic.sports;

import com.xworkz.basic.sports.football.FootBall;

public class SportRunner {
    public static void main(String arg[]) {
        Sport sports = new Sport();

        {
            sports.game();
            sports.refreher();
        }
        FootBall ball = new FootBall();
        {
            ball.game();
            ball.refreher();

        }
    }
}

