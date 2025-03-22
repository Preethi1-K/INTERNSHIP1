class Xworkz
//enterfullname,entercontactnumber,enterwhatsappnumber,enter emailid, enter usn/rollno,qualification ,stream,college name,passout Register}
{
	public static String register(String fullName,String contactNo,String watsappNo,String emailId,String usn,String collegeName)
	{
		String userMessage=null;
		boolean validInformation=provideinfo(fullName,contactNo,watsappNo,emailId,usn,collegeName);
		if (validInformation == true)
			userMessage="registration successfull";
		else
			userMessage="registration is unsuccessfull";
return userMessage; 
	}
	public static boolean provideinfo(String fullName,String contactNo,String watsappNo,String emailId,String usn,String collegeName)
	{
		boolean validInformation=false;
		boolean isfullName=false;
		boolean iscontctNo=false;
		boolean iswatsappNo=false;
		boolean isemailId=false;
		boolean isusn=false;
		boolean iscollegeName=false;
		if(fullName!=null && !fullName.isEmpty() && fullName.length()>=4)
		{
			isfullName=true;
		}
		else
		{
			System.out.println("provide vaild name");
		}
		if(contactNo!=null && !contactNo.isEmpty() && contactNo.length()==10)
		{
			iscontctNo=true;
		}
		else
		{
		  System.out.println("invalid");	
		}
		if(watsappNo!=null && !watsappNo.isEmpty()&& watsappNo.length()==10)
		{
			iswatsappNo=true;
			
		}
		else
		{
			System.out.println("invalid");
			
		}
		if(emailId!=null && !emailId.isEmpty())
		{
			isemailId=true;
		}
		else
		{
			System.out.println("invalid email is mandatory");
		}
		if(usn!=null && !usn.isEmpty())
		{
			isusn=true;
		}
		else
		{
			System.out.println("provide usn");
		}
		if(collegeName!=null && !collegeName.isEmpty())
		{
			iscollegeName=true;
		}
		else
		{
			
			System.out.println("mention college name");
		}
		if(isfullName==true && iscontctNo==true && iswatsappNo==true && isemailId==true && iscollegeName==true)
		{
			validInformation=true;
		}
		return validInformation;
	}
}