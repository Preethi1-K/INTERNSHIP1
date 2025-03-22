class MicroOven{
	static boolean isconnected=false;
	static int currentTemperature;
	static int maxTemperature=10;
	static int minTemperature;
	
public static boolean on()
{
if(isconnected==false)
{
   isconnected=true;
System.out.println("Micro oven is on");
}
else
	if(isconnected == true)
	{
		isconnected=false;
		System.out.println("MicroOven is off");
	}
	return isconnected;
}
public static void  increaseTemperature()
{
	if(isconnected==true)
	{
        		
	if(currentTemperature<maxTemperature)
	{
		currentTemperature=currentTemperature+1;
		System.out.println(currentTemperature);
	}
	else
		System.out.println("max temperature reached..");
	}
	else
		System.out.println("turn on micro oven");
	return;
	
	
}
public static void decreaseTemperature()
{
	if(isconnected==true)
	{
		if(currentTemperature>minTemperature)
		{
			currentTemperature=currentTemperature-1;
			System.out.println(currentTemperature);
			
		}
		else
			System.out.println("min tempearature reached...");
	}
	else
		System.out.println("turn on AC");
	return;
}
}