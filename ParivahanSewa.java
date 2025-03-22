class ParivahanSewa
 {
	public static String signIn(String userName,String password,String captcha,String dob,String gender,String address)
	{
	String informationOfData = null;
	boolean validda=detectData(userName,password,captcha,dob,gender,address);
	if (validdata == true)
		informationOfData = "sign in successfull";
	else
		informationOfData = "sign in unsuccessfull";
	return informationOfData;
	}
	
	public static boolean detectData(String userName,String password,String captcha,String dob,String gender,String address)
	{
		boolean validdata=false;
		boolean isuserName=false;
		boolean ispassword=false;
		boolean iscaptcha=false;
		boolean isdob=false;
		boolean isgender=false;
		boolean isaddress=false;
	if(userName!=null && !userName.isEmpty() && userName.length()>=3)
	{
		isuserName = true;
	}
	else
	{
		System.out.println("user name is invalid");
	}
	if(password!=null && !password.isEmpty())
	{
		ispassword = true;
	}
	else
	{
		System.out.println("provide at least 4 charecter");
	}
	if(captcha!=null && !captcha.isEmpty())
	{
		iscaptcha=true;
	}
	else
	{
		System.out.println("invalid captcha");
	}
	if(dob!=null && !dob.isEmpty())
	{
		isdob=true;
	}
	else
	{
		System.out.println("invalid");
	}
	if(gender!=null && !gender.isEmpty())
	{
		isgender=true;
	}
	else{
		System.out.println("invalid");
		
	}
	if(address!=null && !address.isEmpty())
	{
		isaddress=true;
	}
	else{
		System.out.println("provide address");
	}
	if (isuserName==true && ispassword==true && iscaptcha==true && isdob==true && isgender==true && isaddress==true)
	{
		valid=true;
	}
	
return valid;
	}
}
	
		
