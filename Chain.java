class Chain
{

		Chain()
		{
		  System.out.println("The constructer without arguments");
		}
		
		Chain(String name ,String material,int price)
		{
		  System.out.println("the constructer is invoked with arguments");
		  
		  this.name=name;
		  this.material=material;
		  this.price=price;
		}

	String name;
	String material;
	int price;
	
}