package com.xworkz.basic.playground;
import com.xworkz.basic.playground.cricketground.CricketGround;

public class PlayGroundRunner {
    public static void main(String args[])
    {
        PlayGround playGround = new PlayGround();
        playGround.outdoorGames();
        playGround.maintenance();

        CricketGround cricketGround = new CricketGround();
        cricketGround.outdoorGames();
        cricketGround.maintenance();
    }
}
