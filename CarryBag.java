class CarryBag
{

	CarryBag()
	{
		System.out.println("The carrybag  constructer is created without arguments");
	}
	
	CarryBag(String brand,String material,String color)
	{
	System.out.println("The carrybag  constructer is created with arguments");
		this.brand=brand;
		this.material=material;
		this.color=color;
	}
	
	
	String brand;
	String material;
	String color;
}