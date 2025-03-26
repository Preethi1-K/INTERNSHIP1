class Factory1
{
	String name;
	String location;
	int workers;
	boolean isNightshift;
	String owner;
	double productionRate;
	String technology;
Factory1()
 {
  this("Nash","Bengalore",1200,false,"Gandhi",98.00,"Iot");
  System.out.println("the non arg constracter is invoked");
  
 }
 Factory1(String name)
 {
 this(name,"Bengalore",1200,false,"Gandhi",98.00,"Iot");
 System.out.println("the constracter with name and location  is invoked");
 }
 Factory1(String name,String location)
 {
 this(name,location,1200,false,"Gandhi",98.00,"Iot");
 System.out.println("the constracter with name and location and workers is invoked");
 
 }
 Factory1(String name,String location,int workers)
 {
	 this(name,location,workers,false,"Gandhi",98.00,"Iot");
	 System.out.println("the constracter with  is night shift is invoked");
 }
 
 Factory1(String name,String location,int workers,boolean isNightshift)
 {
 this(name,location,workers,isNightshift,"Gandhi",98.00,"Iot");
 System.out.println("the constracter with owner is invoked");
 }
 Factory1(String name,String location,int workers,boolean isNightshift,String owner)
{
	 this(name,location,workers,isNightshift,owner,98.00,"Iot");
	 System.out.println("the constracter  with technology is invoked");
}
 Factory1(String name,String location,int workers,boolean isNightshift,String owner,double productionRate)
 {
	 this(name,location,workers,isNightshift,owner,productionRate,"Iot");
	 
 }
 Factory1(String name,String location,int workers,boolean isNightshift,String owner,double productionRate,String technology)
 {
	String name=name;
	String location=location;
	int workers=workers;
    boolean isNightshift=isNightshift;
    String owner=owner;
	double productionRate=productionRate;
	String technology=technology;
 System.out.println("all the constracter is invoked");
 }
	
	
	
	public void details()
	{
	 System.out.println("the factory name is"+name);
	 System.out.println("the location of factory is"+location);
	 System.out.println("the number of worker in the factory is"+workers);
	 System.out.println("the timings os factory is"+timings);
	 System.out.println("the safety standers of factory"+safetyStanderds);
	 System.out.println("the technology used in factory is"+technology);
	 
	
	}
	}

	