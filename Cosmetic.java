class Cosmetic
{
		Cosmetic()
		{
		System.out.println("The cosmetic constructer is invoked without arguments");
		}
		
		Cosmetic(String name ,String manufactureDate,int price)
		{
			System.out.println("The cosmetic constructer is invoked with arguments");
		
			this.name=name;
			this.manufactureDate=manufactureDate;
			this.price=price;
		}
		
		String name;
		String manufactureDate;
		int price;
}