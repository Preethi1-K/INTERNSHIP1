package com.xworkz.shirtapp.shirt;

public class Shirt {

    private String brand;
   private  String color;
   private String size;
   private double price;
   private String material;
   private boolean isLongSleeve;
   private String pattern;

   public void setBrand(String brand)
   {
       this.brand=brand;
   }

    public String getBrand()
    {
        return brand;
    }

    public void setColor(String color)
   {
       this.color=color;
   }
   public String getColor()
   {
       return color;
   }
   public void setSize(String size)
   {
       this.size=size;
   }
   public String getSize()
   {
       return size;
   }
   public void setPrice(double price)
   {
       this.price=price;
   }
   public double getPrice()
   {
       return price;
   }
   public void setMaterial(String material)
   {
       this.material=material;
   }

    public String getMaterial()
    {
        return material;
    }
    public void setIslongsleeve(boolean islongsleev)
    {
        this.isLongSleeve=islongsleev;
    }
    public boolean getIslongsleeve()
    {
        return isLongSleeve;
    }
    public void setPattern(String pattern)
    {
        this.pattern=pattern;
    }

    public String getPattern()
    {
        return pattern;
    }
}
