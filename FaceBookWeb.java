class FaceBookWeb{
//firstname,lastname,= last name not emty dob,=gender=male,female,other,mobilenumber,password,=provide atleast 6 digit}=login

	public static String logIn(String firstName , String lastName ,String dob ,String gender,String mobileNumber , String password)
	{
		String resultData = null;
		boolean logInvalid = validData(firstName,lastName,dob,gender,mobileNumber,password);
		if(logInvalid==true)
			resultData = "user login successfull";
		else
			resultData = "user login unsuccessfull sorry";
		return resultData;
	}
	public static boolean validData(String firstName, String lastName,String dob,String gender,String mobileNumber,String password)
	{
		boolean logInvalid=false;
		     boolean isfirstName=false;
			 boolean islastName=false;
			 boolean isdob=false;
			 boolean isgender=false;
			 boolean ismobileNumber=false;
			 boolean ispassword=false;
	if(firstName!=null && !firstName.isEmpty() && firstName.length()>=4)
	{

		isfirstName=true;
	}
	
	else
	{
		System.out.println("provide valid name");
	}
	if(lastName!=null && !lastName.isEmpty() && lastName.length()>=1)
	{
		islastName=true;
	}
	else
	{
		System.out.println("last name empty");
	}
	if(dob!=null && !dob.isEmpty())
	{
		isdob=true;
	}
	else
	{
		System.out.println("dob is necessary");
	}
	if(gender!=null && !gender.isEmpty())
	{
		isgender=true;
	}
	else
	{
		System.out.println("it is mandatory");
	}
	if(mobileNumber!=null && !mobileNumber.isEmpty()&& mobileNumber.length()>0 && mobileNumber.length()==10)	
	{
		ismobileNumber=true;
	}
	else
	{
		System.out.println("provide valid phone number");
	}
	if(password!=null && !password.isEmpty() &&  password.length()>0 && password.length()==6)
	{
		ispassword=true;
	}
	else
	{
		System.out.println("provide valid password");
	}
	if(isfirstName==true && islastName==true && isdob==true && isgender==true && ismobileNumber==true && ispassword==true)
	{
		logInvalid=true;
	}
	return logInvalid;
	}
	}
			
	
