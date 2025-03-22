class Bangalore{
static	String areaPincodes[]={"Adugodi:560030","Agaram:560007","Bellandu:560103","Bhattarahalli:560049","Banglore GPO:560001","AvaniSringerimutt:560086","Bensontown:560046","Bannerghattaroad:560076","Domlur:560071","Dommasandra:562125"};
public static void main(String args[])
{
System.out.println("the strat of main method");
getPincodes();
System.out.println("the end of main method");
}
public static void getPincodes()
{
	System.out.println("inside pincodes()");
	for(String areapincode:areaPincodes)
	{
		System.out.println(areapincode);
	}
	System.out.println("end of Pincode()");
}
}

//System.out.println(areaPincodes[0]+ " "+areaPincodes[1]+ " "+areaPincodes[2]+ " "+areaPincodes[3]+ " "+areaPincodes[4]+ " "+areaPincodes[5]+ " "+areaPincodes[6]+ " "+areaPincodes[7]+ " "+areaPincodes[8]+ " " +areaPincodes[9]);
//System.out.println("the number of items:"+areaPincodes.length);
 

