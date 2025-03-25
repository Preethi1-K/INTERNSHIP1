 class Noodels1
{       
		String flavor;
		String type;
		int price;
 
		
		Noodels1(String flavor,String type,int price)
		{
			
		 System.out.println("The Noodles constructer is invoked with argument");
		this.flavor=flavor;
		this.type=type;
		this.price=price;
		
		}
		public void detailsOfNoodels()
		{
		System.out.println("The maggiMasala flavor is"+this.flavor);
		System.out.println("The maggiMasala typr is"+this.type);
		System.out.println("The maggiMasala price is"+this.price);
		}
		
}