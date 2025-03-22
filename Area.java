class Area{
static int pinCodes[]={2029,5039,6069,1234};
public static void main(String arg[])
{
System.out.println("main started");
getpinCodes();
System.out.println("main ended");
}
public static void getpinCodes(){
	System.out.println("inside pinCodes()");
	System.out.println("the area pincodes are:");
	for(int pincode:pinCodes)
	{
		System.out.println("pinCode");
	}
	System.out.println("end of pincodes()");
}
}
