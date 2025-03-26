class Factory
{
	String name;
	String location;
	int workers;
	boolean isNightshift;
	String owner;
	double productionRate;
	String technology;
	
	
	Factory()
	{
	  this("Nash");
     }
	Factory(String name)
	{
	  this(name,"Baglore");
	  this.name=name;
	 
	 }
	Factory(String location)
	{ 
	  this (1200);
	  this.location=location;
	
	}
	Factory(String workers)
	{
	  this(False);
	  this.workers=workers;

	}
	Factory(boolean isNightshift)
	{ this("Saheb");
	   this.isNightshift=isNightshift;
	}
	
	Factory(String owner)
	{
	this(98.00);
	this.owner=owner;
	}
	Factory(double productionRate)
	{
	this("IOT");
	this.productionRate=productionRate;
	}
	Factory(String technology)
	{
		
		this.technology=technology;
	}
	
		
	   
	public void details()
	{
	 System.out.println("the factory name is"+name);
	 System.out.println("the location of factory is"+location);
	 System.out.println("the number of worker in the factory is"+workers);
	 System.out.println("the factory shifting details is"+isNightshift);
	 System.out.println("the owner of the company"+owner);
	 System.out.println("the  production rate of factory"+productionRate);
	 System.out.println("the technology is"+technology);
	
	}






}