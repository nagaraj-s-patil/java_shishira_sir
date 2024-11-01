class Login
{
	public static void main(String[] arg)
	{
	
		String id="admin";
		int password=123;	
		
		if(id=="admin")
		{
			System.out.println("Email id is valid");
	
			if(password==123)
			{
				System.out.println("password is valid");
				System.out.println("login successfull");
			}
			else
			{
				System.out.println("password is invalid");
				System.out.println("login unsuccessfull");	
			}

		}
		else
		{
			System.out.println("Email id is invalid");
			System.out.println("login unsuccessfull");
		}





	}
}