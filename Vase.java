class Vase{

  Vase()
  {
    System.out.println("The vase constructer is invoked wiyhout argument");
  
  }
  
  Vase(String material,String shape,String color)
  {
	  
	System.out.println("The vase constructer is invoked with arguments")
    this.material=material;
	this.shape=shape;
	this.color=color;
  
  }
  
  
  String material;
  String shape;
  String color;
  
 } 