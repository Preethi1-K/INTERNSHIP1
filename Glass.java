class Glass {
    String type;
    String brand;
    String  thickness;
    String color;
    double price;
    boolean isTempered;
	  
	 Glass()
		{
			this("Tempered glass","Gobian","10mm","white",100.00,true);
			System.out.println("the non arg constracter is invoked");
  
		}
	Glass(String type)
		{
			this(type,"Gobian","10mm","white",100.00,true);
			System.out.println("the constracter with type is invoked");
		}
	Glass(String type,String brand)
		{
			this(type,brand,"10mm","white",100.00,true);
			System.out.println("the constracter with brand is invoked");
 
		}
	Glass(String type,String brand,String thickness)
		{
              this(type,brand,thickness,"white",100.00,true);
			System.out.println("the constracter with thickness is invoked");
		}
	Glass(String type,String brand,String thickness,String color)
		{
	 
			this(type,brand,thickness,color,100.00,true);
			System.out.println("the constracter with color is invoked");
		}
 	Glass(String type,String brand,String thickness,String color,double price)
		{
			this(type,brand,thickness,color,price,true);
			System.out.println("the constracter with price is invoked");
		}
	Glass(String type,String brand,String thickness,String color,double price,boolean isTempered)
			{ 
			        this.type=type;
					this.brand=brand;
					this.thickness=thickness;
					this.color=color;
					this.price=price;
					this.isTempered=isTempered;
					System.out.println("all the constracter is invoked");
			}
 public void detailsOfGlass()
	{
		System.out.println("The type of glass is"+type);
		System.out.println("The brand  of  glass is"+brand);
		System.out.println("thickness  of the glass is"+thickness);
		System.out.println("color of  the  glassis "+color);
		System.out.println(" price of  the glass  is"+price);
		System.out.println(" tempered of  the glass  is"+isTempered);
	
	}

}