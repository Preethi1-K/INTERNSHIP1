class ColdDrink
{
	ColdDrink()
	{
	  System.out.println("The cold drink constructer is invoked without arguments ");
	}
	
	ColdDrink(String name,String quantity,int price)
	{
		
		System.out.println("The cold drink constructer is invoked with arguments ");
		this.name=name;
		this.quantity=quantity;
		this.price=price;
	
	}
	
	String name;
	String quantity;
	int price;
	
	
}