package com.xworkz.tostring;

import com.xworkz.tostring.toString.YouTube;

public class YouTubeRunner {
    public static void main(String[] args) {
        YouTube yt = new YouTube();
        yt.setChannelName("CodeWithZen");
        yt.setSubscribers(100000);
        yt.setVideos(320);
        yt.setMonetized(true);

        System.out.println(yt.toString());
    }
}
