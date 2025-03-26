class Chemicals {
    String name;
    String formula;
    double molecularWeight;
    String state;  
    String hazardLevel;
    String usage;
	
	
  Chemicals()
	{
		this("sulfuric acid","H2So4",98.08,"liquid","high","battery acid");
		System.out.println("the non arg constracter is invoked");
  
	}
 Chemicals(String name)
	{
		this(name,"H2So4",98.08,"liquid","high","battery acid");
		System.out.println("the constracter with  name is invoked");
	}
 Chemicals(String name,String formula)
	{
		this(name,formula,98.08,"liquid","high","battery acid");
		System.out.println("the constracter with formula invoked");
 
	}
Chemicals(String name,String formula,double molecularWeight)
	{
      this(name,formula,molecularWeight,"liquid","high","battery acid");	 	
		System.out.println("the constracter with weight is invoked");
	}
 Chemicals(String name,String formula,double molecularWeight,String state)
	{
	    this(name,formula,molecularWeight,state,"high","battery acid");	 	  
		System.out.println("the constracter with state is invoked");
	}
 Chemicals(String name,String formula,double molecularWeight,String state,String hazardLevel)
	{
	 	   this(name,formula,molecularWeight,state,hazardLevel,"battery acid");	 	  	     
		   System.out.println("the constracter with hazard Level is invoked");
	}
Chemicals(String name,String formula,double molecularWeight,String state,String hazardLevel,String usage)
	{ 
		this.name=name;
		this.formula=formula;
		this.molecularWeight=molecularWeight;
		this.state=state;
		this.hazardLevel=hazardLevel;
		this.usage=usage;
		System.out.println("all the constracter is invoked");
	}
 public void detailsOfChemical()
 {
 System.out.println("The name  of the chemical is"+name);
 System.out.println("The formula of the chemical is"+formula);
 System.out.println("molecularWeight of chemical  is"+molecularWeight);
 System.out.println("molecularWeight of chemical  is"+state);
 System.out.println("hazardLevel of chemical is "+hazardLevel);
 System.out.println(" usage of  chemical is"+usage);

 }

}