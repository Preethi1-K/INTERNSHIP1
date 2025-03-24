class Shampoo
{

		Shampoo()
		{
			System.out.println("The costractor for soap without argumnet");
		}
		
		Shampoo(int  price,int samples,String quantity)
		{
			System.out.println("The costracter for soap with argument is invoked");
			
			this.price=price;
			this.samples=samples;
			this.quantity=quantity;
		
		}
		
		
		int price;
		int samples;
		String quantity;

}