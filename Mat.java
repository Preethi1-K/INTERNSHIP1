class Mat
{

	String material;
	String color;
	int price;
	  
	  
	    Mat()
		{
		
		  System.out.println("Constructer with no arguments");
		
		}
		
		
		Mat(String material,String color,int price )
		{
		  System.out.println("costructer with arguments");
		  this.material=material;
		  this.color=color;
		  this.price=price;
		}

}