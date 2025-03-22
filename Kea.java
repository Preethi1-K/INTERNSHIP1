class Kea
//Regno,password,enter the captcha}
{
	public static String logIn(String registrationNo,String password,String captcha,String fullName,String usn,String collegeName)
	{
		String userMessage=null;
		boolean gettingofData=detectInformation(registrationNo,password,captcha,fullName,usn,collegeName);
	if(gettingofData==true)
		      userMessage="registration successfull";
			else
	           userMessage="registration unsuccessfull";
return userMessage;
	}
	public static boolean detectInformation(String registrationNo,String password,String captcha,String fullName,String usn,String collegeName)
	{
		boolean gettingofData=false;
		boolean isregistrationNo=false;
		boolean ispassword=false;
		boolean iscaptcha=false;
		boolean isfullName=false;
		boolean isusn=false;
		boolean iscollegeName=false;
		if(registrationNo!=null && !registrationNo.isEmpty() && registrationNo.length()==10)
		{
			isregistrationNo=true;
		}
		else
		{
			System.out.println("invalid");		
		}
		if(password!=null && !password.isEmpty()&& password.length()==4)
		{
			ispassword=true;
		}
		else
		{
			System.out.println("provide valid");
		}
		if(captcha!=null && !captcha.isEmpty() &&  captcha.length()==4)
		{
			iscaptcha=true;
		}
		else
		{
			System.out.println("provide valid captcha");
		}
		if(fullName!=null && !fullName.isEmpty() && fullName.length()>=3)
		{
			isfullName=true;
		}
		else{
			System.out.println("give your full name");
		}
		if(usn!=null && !usn.isEmpty() && usn.length()>=10)
		{
			isusn=true;
		}
		else{
			System.out.println("enter your usn");
		}
		if(collegeName!=null && !collegeName.isEmpty())
		{
			iscollegeName=true;
		}
		else
		{
			System.out.println("college name is needed");
		}
		
			
		
		if(isregistrationNo==true && ispassword==true && iscaptcha==true && isfullName==true && isusn==true && iscollegeName==true)
		{
			gettingofData=true;
		}
		return gettingofData;
	}
}