/*
class
object
method
variable
data hiding
abstraction--->interface and abstract class


Encapsulation:
--------------
Biding the data members (variables) and corresponding member functions (methos) 
in a class is called encapsulation.


class  Account{

   //variables
   private String accountHolder;
   private long accountNumber;
   private String accountType;
   private double balance;

	//methods===> setter and getter

         public void setAccountHolder(String accountHolder){
		         this.accountHolder=accountHolder;
		 }

          public String getAccountHolder(){

		     return accountHolder;
		 }
 }



*/

class Account
{
	private String accountHolder;
	private double balance;
	private long accountNumber;
	private  String bankname;

	public void setBankName(String bankname){
	        this.bankname=bankname;
	}

	public String getBankName(){
	        return bankname;
	}

	public void setAccountNumber(long accountNumber){
	    this.accountNumber=accountNumber;
	}

	public long getAccountNumber(){
	       return accountNumber;
	}


	public void setAccountHolder(String accountHolder){
	    this.accountHolder=accountHolder;
	}

	public String getAccountHolder(){
	       return accountHolder;
	}

	public void setBalance(double balance){
	      this.balance=balance;
	}

	public double getBalance(){
	       return balance;
	}

	void debitBalance(double amount){
	      this.balance=this.balance-amount;
	}
}

class EncapsulationDemo1
{
	public static void main(String[] args){
	     Account account1=new Account();

		 account1.setBankName("SBI Bank");
         String s1=account1.getBankName();
         System.out.println(s1);

         account1.setAccountNumber(123456789l);

		 account1.setAccountHolder("Raja");
		 String  retaccname=account1.getAccountHolder();

		 account1.setBalance(10000);
		 account1.debitBalance(5000);

         double retbal=account1.getBalance();

         System.out.println(account1.getAccountNumber()+" account1 account holder name is::  "+retaccname);
		 System.out.println(account1.getAccountNumber()+ " account1 account balance is::  "+retbal);

		 Account account2=new Account();

		 String s2=account2.getBankName();
         System.out.println(s2);

         account2.setAccountNumber(123456798l);
		 account2.setAccountHolder("Rani");

		 String  retaccname1=account2.getAccountHolder();
		
		 account2.setBalance(20000);
		 account2.debitBalance(12000);

         double retbal1=  account2.getBalance();

         System.out.println(account2.getAccountNumber()+" account2 account holder name is::  "+retaccname1);
		 System.out.println(account2.getAccountNumber()+ " account2 account balance is::  "+retbal1);
	}
}