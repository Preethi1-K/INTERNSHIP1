class Soap
{
		Soap()
		{
		  System.out.println("The soap constructer with no arguments");
		}
		
		Soap(int price,String quantity,int samples)
		{
		
		 System.out.println("The soap constructer with arguments");
		 
		 this.price=price;
		 this.quantity=quantity;
		 this.samples=samples;
		}
		
	int price;
	String quantity;
	int samples;

}