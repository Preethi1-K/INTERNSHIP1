class InstagramRunner{
	public static void main(String arg[])
	{
		String givenData=Instagram.logIn("9445089198","ramya");
		System.out.println(givenData);
		String givenData1=Instagram.logIn("ramya@gmail.com");
		System.out.println(givenData1);
	}
}