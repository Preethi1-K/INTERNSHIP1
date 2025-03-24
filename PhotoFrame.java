class PhotoFrame
{
		PhotoFrame()
		{
		 System.out.println(" photoframes constracter with no arguments ");
		}
		
		PhotoFrame(String color,String shape,int price)
		{
		
		 System.out.println("Photoframe  constracter with arguments");
				this.color=color;
				this.shape=shape;
				this.price=price;
		}
		
		String color;
		String shape;
		int price;


}