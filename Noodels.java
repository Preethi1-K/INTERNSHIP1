class Noodels
{


		Noodels()
		{
		  System.out.println("The Noodles constructer is invoked without argument");
	    }
		
		
		String flavor;
		String type;
		int price;
 
		
		Noodels(String flavor,String type,int price)
		{
			
		 System.out.println("The Noodles constructer is invoked with argument");
		this.flavor=flavor;
		this.type=type;
		this.price=price;
		
		}
		
		
	
 
 }