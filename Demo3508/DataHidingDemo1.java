
/*
    Data hiding:
	------------
	1. security

	//design// blueprint // template / model / prototype 

	//collection of data and methods

	class  Account{
	    //data | property 
		int   a=10;   //datatype | reserved word  variable|identifier constant value | literals
	    //methods    // return type  methodName| identifier parameter | return statement
	}

Encapsulation:
--------------
*/

class Account
{
   private double balance=0;
    
	void  setBalance(double balance){
          System.out.println(this.hashCode());
		//logic to check it is a valid user or not
		this.balance=balance;
	
	}

	double getBalance(){

		System.out.println(this.hashCode());
	   return balance;
	}


}

class  DataHidingDemo1
{
	public static void main(String[] args) 
	{
		System.out.println("This is first user operation");
		Account  a1=new Account();
        double  d1=a1.getBalance();
        System.out.println(d1);
		a1.setBalance(5000);
		 double  d2=a1.getBalance();
		System.out.println(d2);

       System.out.println("This is second user operation");
		Account  a2=new Account();
        double  d3=a2.getBalance();
        System.out.println(d3);
		a2.setBalance(10);
		 double  d4=a2.getBalance();
		System.out.println(d4);

		
	}
}
