class InsurancePlan{
public static double search(String insuranceName)
{
  double termPrice=0.0;
	if(insuranceName=="LIC life insurance")
		termPrice=999.99; 
	else
	if(insuranceName=="HDFC life insurance")
		termPrice=890.00;
	else
		
	if(insuranceName=="SBI life indurance")
		termPrice=670.00;
	else
		
	if(insuranceName=="Aditya birla sun life insurance")
		termPrice=870.00;
	else
	if(insuranceName=="Max life insurance")
		termPrice=560.00;
	else
	if(insuranceName=="ICIC prudential life insurance")
		termPrice=670.00;
	else
	if(insuranceName=="TATA aia life insurance")
		termPrice=790.00;
	else
		
	if(insuranceName=="PNB life insurance")
		termPrice=550.00;
	else
	if(insuranceName=="Bharti AXA life insurance")
		termPrice=230.00;
	else
	if(insuranceName=="Future general india life insurance")
		termPrice=450.00;
		else
		{
		System.out.println("search not found");
		}
		return termPrice;
}
}