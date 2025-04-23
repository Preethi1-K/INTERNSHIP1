package com.xworkz.tostring.toString;

public class YouTube {
    private String channelName;
    private int subscribers;
    private int videos;
    private boolean monetized;

    public YouTube() {}
@Override
    public String toString() {
        return "YouTube:(channelName:" + this.channelName + ",\n subscribers:" + this.subscribers + ",\n videos:" + this.videos + ",\n monetized:" + this.monetized + ")";
    }

    public String getChannelName() {
        return channelName;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public int getVideos() {
        return videos;
    }

    public boolean isMonetized() {
        return monetized;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setSubscribers(int subscribers) {
        this.subscribers = subscribers;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public void setMonetized(boolean monetized) {
        this.monetized = monetized;
    }
}
