class House{
 String name;
 String owner;
 int gates;
 int rooms;
 String color;
 String location;
 
 
 House()
 {
  this("Brundavana","sahi",2,3,"Orange","Bengalore");
  System.out.println("the non arg constracter is invoked");
  
 }
 House(String name)
 {
 this(name,"sahi",2,3,"Orange","Bengalore");
 System.out.println("the constracter with name is invoked");
 }
 House(String name,String owner)
 {
 this(name,owner,2,3,"Orange","Bengalore");
 System.out.println("the constracter with name and owner is invoked");
 
 }
 House(String name,String owner,int gates)
 {
 this(name,owner,gates,3,"Orange","Bengalore");
 System.out.println("the constracter with name owner and gates is invoked");
 }
 House(String name,String owner,int gates,int rooms)
 {
 this(name,owner,gates,rooms,"Orange","Bengalore");
 System.out.println("the constracter with rooms is invoked");
 }
 House(String name,String owner,int gates,int rooms,String color)
{
this(name,owner,gates,rooms,color,"Bengalore");
System.out.println("the constracter with color is invoked");
}
 House(String name,String owner,int gates,int rooms,String color,String location)
 { 
 this.name=name;
 this.owner=owner;
 this.gates=gates;
 this.rooms=rooms;
 this.color=color;
 this.location=location;
 System.out.println("all the constracter is invoked");
 }
 public void detailsOfHome()
 {
 System.out.println("The name of the house is"+name);
 System.out.println("The owner of the house is"+owner);
 System.out.println("Number of gates in house is"+gates);
 System.out.println("rooms in house is"+rooms);
 System.out.println("The  color of the house is"+color);
 System.out.println("Location of the house is"+location);
 }

}