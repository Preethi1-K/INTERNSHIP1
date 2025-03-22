class Rapido
//Name, phone number,email,gender,date of birth,emergency contact=profile}
{
	public static String profile(String name,String phoneNo,String email,String gender,String emergencycontact)
	{
		String result=null;
		boolean status=provide(name,phoneNo,email,gender,emergencycontact);
		if(status==true)
		result="profile updated";
	else
		result="profile not updated";
	return result;
	
	}
   public static boolean provide(String name,String phoneNo,String email,String gender,String emergencycontact)
   {
	   boolean status=false;
	   boolean isname=false;
	   boolean isphoneNo=false;
	   boolean isemail=false;
	   boolean isgender=false;
	   boolean isemergencycontact=false;
	   if(name!=null && name.length()>3)
	   {
		   isname=true;
	   }
	   else
	   {
		   System.out.println("invalid");
	   }
	   if(phoneNo!=null && phoneNo.length()==10)
	   {
		   isphoneNo=true;
	   }
	   else
	   {
		   System.out.println("provide phoneno");
	   }
	   if(email!=null)
	   {
		   isemail=true;
	   }
	   else
	   {
		   System.out.println("invalid");
	   }
	   if(gender!=null)
	   {
		   isgender=true;
	   }
	   else
	   {
		   System.out.println("invalid");
	   }
	   if(emergencycontact!=null && emergencycontact.length()==10)
	   {
		   isemergencycontact=true;
	   }
	 else
	 {
		 System.out.println("invalid");
		 
	 }
	 if(isname==true && isphoneNo==true && isemail==true &&isgender==true && isemergencycontact==true )
	 {
		 status=true;
	 }
	 return status;
   }
   }