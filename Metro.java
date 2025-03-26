class Metro {
    String metroName;
    String city;
    int totalStations;
    double ticketPrice;
    boolean isUnderground;
    int totalTrains;
		Metro()
	{
		this("Delhi metro","New Delhi",288,12.00,true,30);
		System.out.println("the non arg constracter is invoked");
  
	}
		Metro(String metroName)
	{
     this(metroName,"New Delhi",288,12.00,true,30);
		System.out.println("the constracter with metro name is invoked");
	}
	Metro(String metroName,String city )
	{
		this(metroName,city,288,12.00,true,30);
		System.out.println("the constracter with name and  city is invoked");
 
	}
	Metro(String metroName,String city ,int totalStations)
		{

			this(metroName,city,totalStations,12.00,true,30);
				System.out.println("the constracter with total stations  is invoked");
		}
		Metro(String metroName,String city ,int totalStations, double ticketPrice)
			{
				this(metroName,city,totalStations,ticketPrice,true,30);
				System.out.println("the constracter with ticketPrice is invoked");
			}
		Metro(String metroName,String city ,int totalStations,double ticketPrice,boolean isUnderground)
			{
				this(metroName,city,totalStations,ticketPrice,isUnderground,30);
				System.out.println("the constracter with under ground is invoked");
			}
 Metro(String metroName,String city ,int totalStations,double ticketPrice,boolean isunderground, int totalTrains)
  { 
		this.metroName=metroName;
		this.city=city;
		this.totalStations=totalStations;
		this.ticketPrice=ticketPrice;
		this.isUnderground=isUnderground;
		this.totalTrains=totalTrains;
		System.out.println("all the constracter is invoked");
 }
 public void detailsOfMetro()
 {
 System.out.println("The metro name  is"+metroName);
 System.out.println("The cityof the metrois"+city);
 System.out.println("totalStations of metro   is"+totalStations);
 System.out.println("ticket Priceof metro is "+ticketPrice);
 System.out.println(" metro is under ground or notof is"+isUnderground);
 System.out.println("total trains in metro   is"+totalTrains);
 }

}