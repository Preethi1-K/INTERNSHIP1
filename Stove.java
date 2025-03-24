class Stove{
    Stove()
	{
	 
	 System.out.println("The consructer is invoked without arguments");
	
	}
	
	Stove(String id,String mode,int price)
	{
	  System.out.println("The constructer is invoked with arguments");
	  this.id=id;
	  this.mode=mode;
	  this.price=price;
	}
	
	String id;
	String mode;
	int price;
}