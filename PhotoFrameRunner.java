class PhotoFrameRunner{
   public static void main(String photo[])
   
   {
     PhotoFrame woodenFrame=new PhotoFrame();
				woodenFrame.color="brown";
				woodenFrame.shape="square";
				woodenFrame.price=500;
	 System.out.println("The photo frame color is"+woodenFrame.color);
	 System.out.println("The photo frame shape is"+woodenFrame.shape);
	 System.out.println("The photo frame price is"+woodenFrame.price);
   
	  PhotoFrame woodenFrame1=new PhotoFrame("brown","square",500);
				System.out.println("The photo frame color is"+woodenFrame1.color);
				System.out.println("The photo frame shape is"+woodenFrame1.shape);
				System.out.println("The photo frame price is"+woodenFrame1.price);
				
	  PhotoFrame mettalicFrame=new PhotoFrame();
				mettalicFrame.color="silver";
				mettalicFrame.shape="rectangle";
				mettalicFrame.price=2000;
	 System.out.println("The photo frame color is"+mettalicFrame.color);
	 System.out.println("The photo frame shape is"+mettalicFrame.shape);
	 System.out.println("The photo frame price is"+mettalicFrame.price);
	 
	 
	 PhotoFrame mettalicFrame2=new PhotoFrame("silver","rectangle",2000);
				System.out.println("The photo frame color is"+mettalicFrame2.color);
				System.out.println("The photo frame shape is"+mettalicFrame2.shape);
				System.out.println("The photo frame price is"+mettalicFrame2.price);
				
	PhotoFrame plasticFrame=new PhotoFrame();
				plasticFrame.color="white";
				plasticFrame.shape="hexagone";
				plasticFrame.price=3000;
	 System.out.println("The photo frame color is"+plasticFrame.color);
	 System.out.println("The photo frame shape is"+plasticFrame.shape);
	 System.out.println("The photo frame price is"+plasticFrame.price);
	 
	 
	 PhotoFrame plasticFrame3=new PhotoFrame("white","hexagone",3000);
				System.out.println("The photo frame color is"+plasticFrame3.color);
				System.out.println("The photo frame shape is"+plasticFrame3.shape);
				System.out.println("The photo frame price is"+plasticFrame3.price);
				
				
	PhotoFrame floatingFrame=new PhotoFrame();
				floatingFrame.color="sky blue";
				floatingFrame.shape="round";
				floatingFrame.price=500;
	 System.out.println("The photo frame color is"+floatingFrame.color);
	 System.out.println("The photo frame shape is"+floatingFrame.shape);
	 System.out.println("The photo frame price is"+floatingFrame.price);
	 
	 
	 PhotoFrame floatingFrame4=new PhotoFrame("sky blue","round",500);
				System.out.println("The photo frame color is"+floatingFrame4.color);
				System.out.println("The photo frame shape is"+floatingFrame4.shape);
				System.out.println("The photo frame price is"+floatingFrame4.price);
	 
	 
	 PhotoFrame leatherFrame=new PhotoFrame();
				leatherFrame.color="pink";
				leatherFrame.shape="cone";
				leatherFrame.price=5000;
	 System.out.println("The photo frame color is"+leatherFrame.color);
	 System.out.println("The photo frame shape is"+leatherFrame.shape);
	 System.out.println("The photo frame price is"+leatherFrame.price);
	 
	 PhotoFrame leatherFrame5=new PhotoFrame("pink","cone",5000);
				System.out.println("The photo frame color is"+leatherFrame5.color);
				System.out.println("The photo frame shape is"+leatherFrame5.shape);
				System.out.println("The photo frame price is"+leatherFrame5.price);
				
				
	 PhotoFrame magneticFrame=new PhotoFrame();
				magneticFrame.color="brown";
				magneticFrame.shape="pentagone";
				magneticFrame.price=999;
	 System.out.println("The photo frame color is"+magneticFrame.color);
	 System.out.println("The photo frame shape is"+magneticFrame.shape);
	 System.out.println("The photo frame price is"+magneticFrame.price);
	 
	 
	 PhotoFrame magneticFrame6=new PhotoFrame("brown","pentagone",999);
				System.out.println("The photo frame color is"+magneticFrame6.color);
				System.out.println("The photo frame shape is"+magneticFrame6.shape);
				System.out.println("The photo frame price is"+magneticFrame6.price);
				
				
	PhotoFrame glassFrame=new PhotoFrame();
				glassFrame.color="white";
				glassFrame.shape="circle";
				glassFrame.price=2000;
	 System.out.println("The photo frame color is"+glassFrame.color);
	 System.out.println("The photo frame shape is"+glassFrame.shape);
	 System.out.println("The photo frame price is"+glassFrame.price);
	 
	 
	 PhotoFrame glassFrame7=new PhotoFrame("white","circle",2000);
				System.out.println("The photo frame color is"+glassFrame7.color);
				System.out.println("The photo frame shape is"+glassFrame7.shape);
				System.out.println("The photo frame price is"+glassFrame7.price);
	 
   
   }


}