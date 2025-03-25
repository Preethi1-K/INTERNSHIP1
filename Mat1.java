class Mat1
{

	String material;
	String color;
	int price;
	  
	  Mat1(String material,String color,int price )
		{
		  System.out.println("costructer with arguments");
		  this.material=material;
		  this.color=color;
		  this.price=price;
		}
		public void detailsOfMat()
		{
		
		System.out.println("The material of yoga mat is"+this.material);
	    System.out.println("The material of yoga mat is"+this.color);
	    System.out.println("The material of yoga mat is"+this.price);
		}

}