class UdupiHotel{
static String hotelMenus[]={"Planrice","Biryanirice","Vegnoodles","Eggfriedrice","cheesepizza","Roastpapad","plaincurd","Paneersandsich","Bundiraita","Frypapad"};
// System.out.println(hotelMenus[0]+ " "+hotelMenus[1]+ " "+hotelMenus[2]+ " "+hotelMenus[3]+ " "+hotelMenus[4]+ " "+hotelMenus[5]+ " "+hotelMenus[6]+ " "+hotelMenus[7]+ " "+hotelMenus[8]+ " "+hotelMenus[9]);
public static void main(String arg[]){
	System.out.println("the strat of main method");
	getUdupihotel();
	System.out.println("the end of main method");
}
public static void getUdupihotel(){
	System.out.println("the inside of udupihotel()");
	{
		for (String hotel:hotelMenus)
		{
			System.out.println(hotel);
		}
	System.out.println("the end of udupihotel()");
	}
//System.out.println("the number of items:"+hotelMenus.length);
}
}