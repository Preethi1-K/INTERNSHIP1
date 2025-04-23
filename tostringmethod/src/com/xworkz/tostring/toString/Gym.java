package com.xworkz.tostring.toString;

public class Gym {

    private String name;
    private String trainer;
    private int members;
    private boolean isOpen24Hours;

    public Gym() {
    }
@Override
    public String toString() {
        return "Gym:(name:" + this.name + ",\n trainer:" + this.trainer + ",\n members:" + this.members + ",\n isOpen24Hours:" + this.isOpen24Hours + ")";
    }

    public String getName() {
        return name;
    }

    public String getTrainer() {
        return trainer;
    }

    public int getMembers() {
        return members;
    }

    public boolean getIsOpen24Hours() {
        return isOpen24Hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public void setIsOpen24Hours(boolean isOpen24Hours) {
        this.isOpen24Hours = isOpen24Hours;
    }
}
