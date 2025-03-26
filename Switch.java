class Switch {
    String brand;
    String type;
    int numberOfPorts;
    boolean isSmartSwitch;
    double price;
    String color;
	
	
	Switch()
		{
			this("Cisco","managed network switch",24,true,100.0,"white");
			System.out.println("the non arg constracter is invoked");
  
		}
	Switch(String brand)
		{
			this(brand,"managed network switch",24,true,100.0,"white");
			System.out.println("the constracter with brand is invoked");
		}
	Switch(String brand,String type)
		{
			this(brand,type,24,true,100.0,"white");
			System.out.println("the constracter with  type is invoked");
 
		}
	Switch(String brand,String type,int numberOfPorts)
		{
			this(brand,type,numberOfPorts,true,100.0,"white");
			System.out.println("the constracter with ports is invoked");
		}
	Switch(String brand,String type,int numberOfPorts,boolean isSmartSwitch)
		{
	 
			this(brand,type,numberOfPorts,isSmartSwitch,100.0,"white");
			System.out.println("the constracter with smart switch is invoked");
		}
 	Switch(String brand,String type,int numberOfPorts,boolean isSmartSwitch,double price)
		{
			this(brand,type,numberOfPorts,isSmartSwitch,price,"white");
			System.out.println("the constracter with price is invoked");
		}
	Switch(String brand,String type,int numberOfPorts,boolean isSmartSwitch,double price,String color)
			{ 
			        this.brand=brand;
					this.type=type;
					this.numberOfPorts=numberOfPorts;
					this.isSmartSwitch=isSmartSwitch;
					this.price=price;
					this.color=color;
					System.out.println("all the constracter is invoked");
			}
 public void detailsOfSwitch()
	{
		System.out.println("The brand of switch "+brand);
		System.out.println("The type of  switch is"+type);
		System.out.println("numberOfPorts  of the switch  is"+numberOfPorts);
		System.out.println(" switch type is "+isSmartSwitch);
		System.out.println(" the price of switch is"+price);
		System.out.println(" the color  of  smart is"+color);
	
	}

}	
