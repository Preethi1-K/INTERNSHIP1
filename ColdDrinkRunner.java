class ColdDrinkRunner
{

	public static void main(String water[])
	{
	ColdDrink softDrink = new ColdDrink();
	       softDrink.name = "Coco-Cola";
		   softDrink.quantity = "750ml";
		   softDrink. price = 40;
	System.out.println("The name of soft drink is"+softDrink.name);
	System.out.println("the quantity of softdrink is"+softDrink.quantity);
	System.out.println("the price of soft drink is"+softDrink.price);
	
	ColdDrink softDrink1 = new ColdDrink("Coco-Cola","750ml",40);
	
	System.out.println("The name of soft drink is"+softDrink1.name);
	System.out.println("the quantity of softdrink is"+softDrink1.quantity);
	System.out.println("the price of soft drink is"+softDrink1.price);
   
   
   ColdDrink juice=new ColdDrink();
			juice.name="Mazza";
			juice.quantity="1 liter";
			juice.price=65;
	System.out.println("The name of the juiceis"+juice.name);
	System.out.println("The quantity of juice is"+juice.quantity);
	System.out.println("The price of juice is"+juice.price);
	
  ColdDrink juice2=new ColdDrink("Mazza","1liter",65);
	
	System.out.println("The name of the juiceis"+juice2.name);
	System.out.println("The quantity of juice is"+juice2.quantity);
	System.out.println("The price of juice is"+juice2.price);
	
  ColdDrink mocktail=new ColdDrink();
			mocktail.name="Appy Fizz";
			mocktail.quantity="500 ml";
			mocktail.price=50;
	 System.out.println("The mocktail name is"+mocktail.name);
	 System.out.println("The mocktail quantity is"+mocktail.quantity);
	 System.out.println("The mocktail price is"+mocktail.price);
 
 ColdDrink mocktail3=new ColdDrink("Appy Fizz","500 ml",50);
  
	 System.out.println("The mocktail name is"+mocktail3.name);
	 System.out.println("The mocktail quantity is"+mocktail3.quantity);
	 System.out.println("The mocktail price is"+mocktail3.price);
	 
 ColdDrink fizzyDrink=new ColdDrink();
			fizzyDrink.name="7up";
			fizzyDrink.quantity="500 ml";
			fizzyDrink.price=40;
	 System.out.println("The fizzyDrink name is"+fizzyDrink.name);
	 System.out.println("The fizzyDrink quantityis"+fizzyDrink.quantity);
	 System.out.println("The fizzyDrink price is"+fizzyDrink.price);
	 
 ColdDrink fizzyDrink4=new ColdDrink("7up","500ml",40);
		System.out.println("The fizzyDrink name is"+fizzyDrink4.name);
		System.out.println("The fizzyDrink quantityis"+fizzyDrink4.quantity);
		System.out.println("The fizzyDrink price is"+fizzyDrink4.price);
		
 ColdDrink soda=new ColdDrink();
		soda.name="Thums up";
		soda.quantity="750 ml";
		soda.price=70;
		System.out.println("The sada name is"+soda.name);
		System.out.println("The soda quantity is"+soda.quantity);
		System.out.println("The soda price is "+soda.price);
		
 ColdDrink soda5=new ColdDrink("Thums up","750 ml",70);
		System.out.println("The sada name is"+soda5.name);
		System.out.println("The soda quantity is"+soda5.quantity);
		System.out.println("The soda price is "+soda5.price);
		
 ColdDrink icedDrink=new ColdDrink();
		icedDrink.name="Fanta";
		icedDrink.quantity="500 ml";
		icedDrink.price=80;
		System.out.println("The icedDrink name is"+icedDrink.name);
		System.out.println("The icedDrink quantity is"+icedDrink.quantity);
		System.out.println("The icedDrink price is"+icedDrink.price);

 ColdDrink icedDrink6=new ColdDrink("Fanta","500 ml",80);
		System.out.println("The icedDrink name is"+icedDrink6.name);
		System.out.println("The icedDrink quantity is"+icedDrink6.quantity);
		System.out.println("The icedDrink price is"+icedDrink6.price);

		
ColdDrink beverage=new ColdDrink();
		beverage.name="Mirinda";
		beverage.quantity="1 liter";
		beverage.price=100;
	System.out.println("The Beverage name is"+beverage.name);
	System.out.println("The Beverage quantity is"+beverage.quantity);
	System.out.println("The Beverage price is"+beverage .price);

	
ColdDrink beverage7= new ColdDrink("Mirinda","1 liter",100);
	System.out.println("The Beverage name is"+beverage7.name);
	System.out.println("The Beverage quantity is"+beverage7.quantity);
	System.out.println("The Beverage price is"+beverage7.price);
     
   }
	
}