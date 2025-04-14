package com.xworkz.basic.season;

import com.xworkz.basic.season.summer.Summer;

public class SeasonRunner {

    public static void main(String arg[])
    {
        Season season=new Summer();
        Summer summer=(Summer)season;
        season.season();
        season.summer();
        summer.season();
        season.summer();
    }
}
