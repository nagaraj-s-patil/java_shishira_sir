class SwitchExample
{
	public static void main(String[] arg)
	{
		int choice=1;
		switch(choice)
		{
			case 1:System.out.println("In case 1");
			break;
			case 2:System.out.println("in vase 2");
			break;
			default:
				System.out.println("In Default");
		}
		
		System.out.println("----outside switch----");
	
	}
}