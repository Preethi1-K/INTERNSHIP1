class Flag
{
	String country;
    String color;
    int stripes;
    boolean hasSymbol;
    String  size;
    String material;

	
	Flag()
		{
			this("US","Red,white,blue",13,true,"3feet*5feet","Nylon");
			System.out.println("the non arg constracter is invoked");
  
		}
	Flag(String country)
		{
			this(country,"Red,white,blue",13,true,"3feet*5feet","Nylon");
			System.out.println("the constracter with country is invoked");
		}
	Flag(String country,String color)
		{
			this(country,"Red,white,blue",13,true,"3feet*5feet","Nylon");
			System.out.println("the constracter with color is invoked");
 
		}
	Flag(String country,String color,int stripes)
		{
			this(country,color,stripes,true,"3feet*5feet","Nylon");
			System.out.println("the constracter with stripes is invoked");
		}
	Flag(String country,String color,int stripes,boolean hasSymbol)
		{
	 
			this(country,color,stripes,hasSymbol,"3feet*5feet","Nylon");
			System.out.println("the constracter with symbol is invoked");
		}
 	Flag(String country,String color,int stripes,boolean hasSymbol,String size)
		{
			this(country,color,stripes,hasSymbol,size,"Nylon");
			System.out.println("the constracter with size is invoked");
		}
	Flag(String country,String color,int stripes,boolean hasSymbol,String size,String material)
			{ 
			        this.country=country;
					this.color=color;
					this.stripes=stripes;
					this.hasSymbol=hasSymbol;
					this.size=size;
					this.material=material;
					System.out.println("all the constracter is invoked");
			}
 public void detailsOfFlag()
	{
		System.out.println("The country name is"+country);
		System.out.println("The color  of  flag is"+color);
		System.out.println("Stripes  of the flag  is"+stripes);
		System.out.println("Sysmbol of  the flag is "+hasSymbol);
		System.out.println(" size of  the falg  is"+size);
		System.out.println(" material of  the falg  is"+material);
	
	}

}