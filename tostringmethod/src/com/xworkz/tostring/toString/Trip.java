package com.xworkz.tostring.toString;

public class Trip {

    private String destination;
    private String modeOfTransport;
    private int duration;
    private double cost;
    private String purpose;

    public Trip() {
    }
@Override
    public String toString() {
        return "Trip:(destination:" + this.destination + ",\n modeOfTransport:" + this.modeOfTransport + ",\n duration:" + this.duration + ",\n cost:" + this.cost + ",\n purpose:" + this.purpose + ")";
    }

    public String getDestination() {
        return destination;
    }

    public String getModeOfTransport() {
        return modeOfTransport;
    }

    public int getDuration() {
        return duration;
    }

    public double getCost() {
        return cost;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setModeOfTransport(String modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
