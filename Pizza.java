class Pizza{
static int id=101; 
static String name="Margherita"; 
static String  size="Medium";  
static String  type="Vegetarian";  
static int  price=120;
public static void main(String item[])
{
	System.out.println("the pizza id is"+id);
    System.out.println("the pizza name is"+name);
    System.out.println("the pizza size is"+  size);
	System.out.println("the type pizza  is"+type);
	System.out.println("the price of pizza is"+price);
	update();
	System.out.println("the pizza id is"+id);
	System.out.println("the pizza name is"+name);
	System.out.println("the pizza size is"+  size);
	System.out.println("the type pizza  is"+type);
	System.out.println("the price of pizza is"+price);
}
public static void update()
{
	id=10; 
	name="Onion"; 
	size="Large";  
	type="Non vegetarian";  
	price=200;
	
}
}