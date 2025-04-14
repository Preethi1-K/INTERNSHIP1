package com.xworkz.basic.playground;
import com.xworkz.basic.playground.cricketground.CricketGround;

public class PlayGroundRunner {
    public static void main(String args[])
    {
        PlayGround playGround = new CricketGround();
        CricketGround cricketGround = (CricketGround) playGround;
        playGround.outdoorGames();
        playGround.maintenance();
        cricketGround.outdoorGames();
        cricketGround.maintenance();
    }
}
