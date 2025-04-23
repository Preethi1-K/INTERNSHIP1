package com.xworkz.tostring.toString;

public class SimpleGuiApp {

    private String name;
    private String version;
    private String framework;
    private String developer;

    public SimpleGuiApp() {
    }
@Override
    public String toString() {
        return "SimpleGuiApp:(name:" + this.name + ",\n version:" + this.version + ",\n framework:" + this.framework + ",\n developer:" + this.developer + ")";
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getFramework() {
        return framework;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
