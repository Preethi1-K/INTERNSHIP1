class Speaker{
	static boolean isconnected=false;
	static int currentVolume;
	static int maxVolume=6;
	static int minolume;
	
public static boolean on()
{
if(isconnected==false)
{
   isconnected=true;
System.out.println("speaker is on");
}
else
	if(isconnected == true)
	{
		isconnected=false;
		System.out.println("speaker is off");
	}
	return isconnected;
}
public static void  increaseVolume()
{
	if(isconnected==true)
	{
        		
	if(currentVolume<maxVolume)
	{
		currentVolume=currentVolume+1;
		System.out.println(currentVolume);
	}
	else
		System.out.println("max volume reached..");
	}
	else
		System.out.println("turn on speaker");
	return;
	
	
}
public static void decreaseVolume()
{
	if(isconnected==true)
	{
		if(currentVolume>minVolume)
		{
			currentVolume=currentVolume-1;
			System.out.println(currentVolume);
			
		}
		else
			System.out.println("min Volume reached...");
	}
	else
		System.out.println("turn on Speaker");
	return;
}
}
