class Projector1{
	static boolean isconnected=false;
	static int currentBrightness;
	static int maxBrightness=10;
	static int minBrightness;
	
public static boolean on()
{
if(isconnected==false)
{
   isconnected=true;
System.out.println("Projector1 is on");
}
else
	if(isconnected == true)
	{
		isconnected=false;
		System.out.println("Projector1 is off");
	}
	return isconnected;
}
public static void  increaseBrightness()
{
	if(isconnected==true)
	{
        		
	if(currentBrightness<maxBrightness)
	{
		currentBrightness=currentBrightness+1;
		System.out.println(currentBrightness);
	}
	else
		System.out.println("max Brightness reached..");
	}
	else
		System.out.println("turn on projector1");
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
