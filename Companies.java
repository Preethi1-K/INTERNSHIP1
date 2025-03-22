class Companies{
static String names[]={"Google","Amazon","Deloitte","Infosys",
"Wipro","MuSigma","SAPLabsIndiaPvtLtd","KPMGIndiaPvtLtd","IntuitIndia","Adobe","cognizant","HewlettPackardEnterprise","MindreLtd","Techmahindra","Mphasis","Larsen&ToubroInfotech","HCL","Dell","Flipkart","InfosysBPM","Bosch","Siemens","VMware","JuniperNetworksIndiaPvtLtd","Nokia","Intel","Yahoo","Linkdln","Twitter","Uber","Ola","Swiggy","SystemsIndiaPvtLtd","CicscoSystem(India)PvtLtd","TCS","AmericanExpress","Capgemini","Accenture","IBM","Oracle","Microsoft"};
public static void main(String arg[])
{
System.out.println("the start of main method");
getNames();
System.out.println("the end of main method");
}
public static void getNames()
{
	System.out.println("the inside of getNames()");
	for(String name:names)
	{
		System.out.println(name);
		
	}
	System.out.println("the outside of the getNames()");
}
}
//System.out.println(names[0]+" "+names[1]+" "+names[2]+" "+names[3]+" "+names[4]+" "+names[5]+" "+names[6]+" "+names[7]+" "+names[8]+" "+names[9]+" "+names[10]+" "+names[11]+" "+names[12]+" "+names[13]+" "+names[14]+" "+names[15]+" "+names[16]+" "+names[17]+" "+names[18]+" "+names[19]+" "+names[20]+" "+names[21]+" "+names[22]+" "+names[23]+" "+names[24]+" "+names[25]+" "+names[26]+" "+names[27]+" "+names[28]+" "+names[29]+" "+names[30]+" "+names[31]+" "+names[32]+" "+names[33]+" "+names[34]+" "+names[35]+" "+names[36]+" "+names[37]+" "+names[38]+" "+names[39]+" "+names[40]);
//System.out.println("the number of items:"+names.length);


