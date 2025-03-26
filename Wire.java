class Wire {
    String type;
    String material;
    double length;
    double thickness;
    String color;
    boolean isInsulated;

	
	Wire()
	{
		this("Copper electrical wire","copper",10.00,2.5,"red",true);
		System.out.println("the non arg constracter is invoked");
  
	}
 Wire(String type)
	{
		this(type,"copper",10.00,2.5,"red",true); 
		System.out.println("the constracter with type is invoked");
	}
 Wire(String type,String  material)
	{
	 	this(type,material,10.00,2.5,"red",true); 
		System.out.println("the constracter with material invoked");
 
	}
 Wire(String type,String material,double length )
	{	 	
 
	this(type,material,length,2.5,"red",true); 
	System.out.println("the constracter with length is invoked");
	}
  Wire(String type,String material,double length,double thickness )
	{
	      this(type,material,length,thickness,"red",true); 
		System.out.println("the constracter with thickness is invoked");
	}
   Wire(String type,String material,double length,double thickness,String color )
	{
	 	   	      this(type,material,length,thickness,color,true);
		   System.out.println("the constracter with color is invoked");
	}
   Wire(String type,String material,double length,double thickness,String color,boolean isInsulated )
	{ 
		this.type=type;
		this.material=material;
		this.length=length;
		this.thickness=thickness;
		this.color=color;
		this.isInsulated=isInsulated;
		System.out.println("all the constracter is invoked");
	}
 public void detailsOfWire()
 {
 System.out.println("The type of the wire is"+type);
 System.out.println("The material of the wire is"+material);
 System.out.println("length of wire  is"+length);
 System.out.println("thickness of wire "+thickness);
 System.out.println(" color of wire is"+color);
 System.out.println("is insulated of wire is"+isInsulated);
 }

}