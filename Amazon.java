class Amazon{
public static String logIn(String mobileNo, String email,String firstNameAndlastName,String gender,String address,String sentotp)
	{
		String givenData=null;
		boolean detect=profileCheck(mobileNo,email,firstNameAndlastName,gender,address,sentotp);
		if(detect==true)
		getData="log in successfully";
	else
		getData="log in unsuccessfull ";
return givenData;
     }
	 public static boolean profileCheck(String mobileNo,String email,String firstNameAndlastName,String gender,String address,String sentotp)
	 {
		 boolean get=false;
		 boolean ismobileNo=false;
		 boolean isemail=false;
		 boolean isfirstNameAndlastName=false;
		 boolean isgender=false;
		 boolean isaddress=false;
		 boolean issentotp=false;
		 if(mobileNo!=null && !mobileNo.isEmpty() && mobileNo.length()==10)
		 {
			 ismobileNo=true;
		 }
		 else
		 {
			System.out.println("invalid"); 
		 }
		 if(email!=null && !email.isEmpty())
		 {
			 isemail=true;
		 }
		 else
		 {
			 System.out.println("provide valid email");
			 
		 }
		 if(firstNameAndlastName!=null &&  !firstNameAndlastName.isEmpty() && firstNameAndlastName.length()>=5)
		 {
			 isfirstNameAndlastName=true;
		 }
		 else
		 {
			 System.out.println("provide proper naming convention");
		 }
		 if(gender!=null && !gender.isEmpty())
		 {
			 isgender=true;
		 }
		 else
		 {
			 System.out.println("invalid");
		 }
		 if(address!=null && !address.isEmpty())
		 {
			isaddress=true;
		  }
		  else
		  {
			  System.out.println("provide address");
		  }
		  if(sentotp!=null && !sentotp.isEmpty())
		  {
			  issentotp=true;
		  }
		  else
		  {
			  System.out.println("provide otp");
		  }
		 if (ismobileNo==true && isemail==true && isfirstNameAndlastName==true && isgender==true && isaddress==true && issentotp==true)
		 {
			 get=true;
		 }
		 return get;
		 
	 }
}