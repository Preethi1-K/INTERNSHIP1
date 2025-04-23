package com.xworkz.tostring.toString;

public class Symbol {

    private String name;
    private String meaning;
    private String origin;
    private String usage;
    private String type;

    public Symbol() {
    }
@Override
    public String toString() {
        return "Symbol:(name:" + this.name + ",\n meaning:" + this.meaning + ",\n origin:" + this.origin + ",\n usage:" + this.usage + ",\n type:" + this.type + ")";
    }

    public String getName() {
        return name;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getOrigin() {
        return origin;
    }

    public String getUsage() {
        return usage;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public void setType(String type) {
        this.type = type;
    }
}
