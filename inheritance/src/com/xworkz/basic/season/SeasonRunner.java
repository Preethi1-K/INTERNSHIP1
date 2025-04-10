package com.xworkz.basic.season;

import com.xworkz.basic.season.summer.Summer;

public class SeasonRunner {

    public static void main(String arg[])
    {
        Season season=new Season();
        season.season();
        season.summer();
        Summer summer=new Summer();
        summer.season();
        season.summer();
    }
}
