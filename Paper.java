class Paper {
    String type;
    String size;
    String thickness;
    String color;
    boolean isRecycled;
    String brand;
Paper()
 {
  this("Bond","A4","2mm","Orange",true,"classmate");
  System.out.println("the non arg constracter is invoked");
  
 }
 Paper(String type)
 {
	 this(type,"A4","2mm","Orange",true,"classmate");
    System.out.println("the constracter with type is invoked");
 }
 Paper(String type,String size)
 {
  this(type,size,"2mm","Orange",true,"classmate");
 System.out.println("the constracter with type and size is invoked");
 
 }
 Paper(String type,String size,String thickness)
 {
  this(type,size,thickness,"Orange",true,"classmate");
   System.out.println("the constracter with thickness is invoked");
 }
  Paper(String type,String size,String thickness,String color)
 {
	   this(type,size,thickness,color,true,"classmate");
       System.out.println("the constracter with color is invoked");
 }
 Paper(String type,String size,String thickness,String color,boolean isRecycled)
 {
	 	   this(type,size,thickness,color,isRecycled,"classmate");
		   System.out.println("the constracter with recycled is invoked");
 }
 Paper(String type,String size,String thickness,String color,boolean isRecycled,String brand)
  { 
 this.type=type;
 this.size=size;
 this.thickness=thickness;
 this.color=color;
 this.isRecycled=isRecycled;
 this.brand=brand;
 System.out.println("all the constracter is invoked");
 }
 public void detailsOfPaper()
 {
 System.out.println("The type of the page is"+type);
 System.out.println("The size of the pageis"+size);
 System.out.println("thickness of page  is"+thickness);
 System.out.println("color of page "+color);
 System.out.println(" recycling of page is"+isRecycled);
 System.out.println("brand of page  is"+brand);
 }

}