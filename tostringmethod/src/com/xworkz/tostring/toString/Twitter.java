package com.xworkz.tostring.toString;

public class Twitter {

    private String handle;
    private int followersCount;
    private int tweetsCount;
    private String bio;
    private String joinDate;

    public Twitter() {
    }
@Override
    public String toString() {
        return "Twitter:(handle:" + this.handle + ",\n followersCount:" + this.followersCount + ",\n tweetsCount:" + this.tweetsCount + ",\n bio:" + this.bio + ",\n joinDate:" + this.joinDate + ")";
    }

    public String getHandle() {
        return handle;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public int getTweetsCount() {
        return tweetsCount;
    }

    public String getBio() {
        return bio;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public void setTweetsCount(int tweetsCount) {
        this.tweetsCount = tweetsCount;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
}
