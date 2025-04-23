package com.xworkz.tostring.toString;

public class Facebook {
    private String profileName;
    private int friends;
    private boolean active;
    private String status;

    public Facebook() {}
@Override
    public String toString() {
        return "Facebook:(profileName:" + this.profileName + ",\n friends:" + this.friends + ",\n active:" + this.active + ",\n status:" + this.status + ")";
    }

    public String getProfileName() {
        return profileName;
    }

    public int getFriends() {
        return friends;
    }

    public boolean isActive() {
        return active;
    }

    public String getStatus() {
        return status;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setFriends(int friends) {
        this.friends = friends;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
