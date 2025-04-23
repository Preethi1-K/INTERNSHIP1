package com.xworkz.tostring.toString;

public class Color {

    private String name;
    private String hexCode;
    private boolean isPrimary;
    private String family;

    public Color() {
    }
@Override
    public String toString() {
        return "Color:(name:" + this.name + ",\n hexCode:" + this.hexCode + ",\n isPrimary:" + this.isPrimary + ",\n family:" + this.family + ")";
    }

    public String getName() {
        return name;
    }

    public String getHexCode() {
        return hexCode;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public String getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
