class TubeLight
{

		TubeLight()
		{
		  System.out.println("The tube light constructer is invoked without arguments");
		}
		
		TubeLight(String name , String power,int price)
		{
		System.out.println("The tube light constructer is invoked with arguments");
		this.name=name;
		this.power=power;
		this.price=price;
		
		}
		
		String name;
		String power;
		int price;
		
}
		