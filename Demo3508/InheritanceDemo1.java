/*
   Data hiding===>security

   Inheritance:
   ------------
   why inheritance:-
       to access one class all properties  and functionalities
	   of Parent class to Child class (other class).

	   ===>reusability

	   to acheive inheritance, we use "extends"  keyword.

	   syntax:
       ========
	   class Parent{
	   
	   }
	   class Child extends Parent{
	     
	   }
   
*/

class Bank
{
   
   void registration(){
      System.out.println("registration");
   }

   void  login(){
      System.out.println("login");
   }
}

class Customer extends Bank
{
    void debitBalance(){
	  System.out.println("debit balance");
	}

	void creditBalance(){
	  System.out.println("credit Balance");
	}
	
}

class BankEmployee extends Customer
{
	
}

class InheritanceDemo1
{
	public static void main(String[] args){
     
	 //case-1:
     System.out.println("===========bank==========");
         Bank  b1=new Bank();

		 b1.registration();
		 b1.login();

		// b1.debitBalance();//parent class obj ref calling child class functionalities
		// b1.creditBalance();

  //case-2:
      System.out.println("===========bank employee==========");
		 BankEmployee e1=new BankEmployee();

		 e1.registration();
		 e1.login();
		 e1.debitBalance();
		 e1.creditBalance();
    //case-3
     System.out.println("===========customer==========");
	     Bank c1=new Customer();
		// c1.debitBalance();
		// c1.creditBalance();
         c1.registration();
		 c1.login();

		 //case-4:
      // Customer c2= new Bank();

	}
}
