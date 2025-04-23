package com.xworkz.tostring.toString;

public class Instagram {

    private String username;
    private int followers;
    private int posts;
    private boolean verified;

    public Instagram() {}
@Override
    public String toString() {
        return "Instagram:(username:" + this.username + ",\n followers:" + this.followers + ",\n posts:" + this.posts + ",\n verified:" + this.verified + ")";
    }

    public String getUsername() {
        return username;
    }

    public int getFollowers() {
        return followers;
    }

    public int getPosts() {
        return posts;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
