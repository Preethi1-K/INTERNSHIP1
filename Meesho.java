class Meesho
//signup phone number ,sent otp,username,gender,password,
{
	public static String signUp(String phoneNumber,String sentOtp,String userName,String gender,String password,String address )
	{
		String resultOfData=null;
		boolean verify = profileData(phoneNumber,sentOtp,userName,gender,password,address);
		if(verify == true)
		
	        resultOfData="successfull";
		else
			resultOfData="unccessfull";
		
		return resultOfData;
	}
	public static boolean profileData(String phoneNumber,String sentOtp,String userName,String gender,String password,String address)
	{
		boolean verify=false;
		boolean isphoneNumber=false;
		boolean issentOtp=false;
		boolean isuserName=false;
		boolean isgender=false;
		boolean ispassword=false;
		boolean isaddress=false;
		if(phoneNumber!=null && !phoneNumber.isEmpty()&& phoneNumber.length()==10)
		{
			isphoneNumber=true;
		}
		else
		{
			System.out.println("provid valid phone number");
		}
		if(sentOtp!=null && !sentOtp.isEmpty() && sentOtp.length()==4)
		{
			issentOtp=true;
		}
		else
		{
			System.out.println("provide otp");
		}
		if (userName!=null && !userName.isEmpty() && userName.length()>=3)
		{
			isuserName=true;
		}
		else
		{
			System.out.println("provide name");
		}
		if (gender!=null  && !gender.isEmpty())
		{
			isgender=true;
		}
		else
		{
			System.out.println("its mandatory");
		}
		if (password!=null && !password.isEmpty() &&  password.length()==4)
		{
			ispassword=true;
		}
		else
		{
			System.out.println("password invalid");
		}
		if(address!=null && !address.isEmpty() )
		{
			isaddress=true;
		}
		else
		{
			System.out.println("please provide address");
		}
		if(isphoneNumber==true && issentOtp==true && isuserName==true && isgender==true && ispassword==true)
		{
			verify=true;
		}
		return verify;
	}
}