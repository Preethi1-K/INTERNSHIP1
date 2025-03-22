class Ac{
	static boolean isconnected=false;
	static int currentTemperature;
	static int maxTemperature=6;
	static int minTemperature;
	
public static boolean on()
{
if(isconnected==false)
{
   isconnected=true;
System.out.println("ac is on");
}
else
	if(isconnected == true)
	{
		isconnected=false;
		System.out.println("ac is off");
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
		System.out.println("turn on Ac");
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

	
	