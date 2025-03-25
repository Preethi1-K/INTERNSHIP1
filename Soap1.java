class Soap1
{
		Soap1()
		{
		  System.out.println("The soap constructer with no arguments");
		}
		
		Soap1(int price,String quantity,int samples)
		{
		
		 System.out.println("The soap constructer with arguments");
		 
		 this.price=price;
		 this.quantity=quantity;
		 this.samples=samples;
		}
		
		
		public void detailsOfSoap()
		{
			
			System.out.println("The soap price is"+this.price);
			System.out.println("The soap quantity is"+this.quantity);
			System.out.println("The soap samples is"+this.samples);
 
		}
		
	int price;
	String quantity;
	int samples;

}