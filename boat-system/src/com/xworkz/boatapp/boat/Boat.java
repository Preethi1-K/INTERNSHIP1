package com.xworkz.boatapp.boat;

public class Boat {
  private  int boatId;
  private   String boatName;
  private   String boatOwner;
   private String  boatType;
   //enscapulation ahieve use private
   // en rule 1 class public,2 datamember private,3 commonly define constracter,4 private getter and setterkeyword
    //setter method always void
   public void setBoatId(int boatId)
   {
      this. boatId=boatId;
   }
   //get method return value
   public int getBoatId()
   {
       return boatId;
   }
   public void setBoatName(String boatName)
   {
       this.boatName=boatName;
   }
    public String getBoatName()
    {
        return boatName;
    }
    public  void  setBoatOwner(String boatOwner)
    {
        this.boatOwner=boatOwner;
    }
    public String getBoatOwner()
    {
        return boatOwner;
    }
    public void setBoatType(String boatType)
    {
        this.boatType=boatType;
    }
    public  String getBoatType()
    {
        return boatType;
    }
   //accesoors(getter)  and mutators(settor)(methods)---set and get value






}
