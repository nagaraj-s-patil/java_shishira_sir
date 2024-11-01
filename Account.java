class Account{

	String name;
	long accountNum;
	float balance;
	
	Account(String name,long accountNum,float balance){
	
	this.name=name;
	this.accountNum=accountNum;
	this.balance=balance;
	}

	public static void main(String[] arg){
	
	Account AC1=new Account("nagaraj",1234567891l,4000);
	Account AC2=new Account("Mallikarjun",1234567892l,5000);

	System.out.println(AC1.name+" "+AC1.accountNum+" "+AC1.balance);

	System.out.println(AC2.name+" "+AC2.accountNum+" "+AC2.balance);
	
	 
	

	}

}