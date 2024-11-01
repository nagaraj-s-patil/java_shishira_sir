class car{
	String color;
	String brand="lamborghini"; 
	public static void main(String[] arg){
		
	car color1=new car();
	car color2=new car();
	car brandCar =new car();
	
	color1.color="green";
	color2.color="red";	

	System.out.println(color1.color+" "+brandCar.brand);

	System.out.println(color2.color+" "+brandCar.brand);
	}
}