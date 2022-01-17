/*
 Object orinted programming system:
 ----------------------------------
  Object orinted programming :
      class:   why ,how
	  object:  why ,how
	  variables:
	  method:/function/member function

class:- 
class is a design or blueprint or model or template which
generates the object in the realtime.

  syntax to define a class:
    class  ClassName{
	   
	   //data

	   //methods
	
	}

   Class is the collection of data and methods.
   
   At the class loading static member will get the memory.
   Class loads within method area as the part of JVM.
   Static member gets the memory only once.
   we can access static member(variables/ methods) by using classname.

	//ClassName:-  we can use any valid java identifier.
    //data:-  variables/ properties/ fields/attributes
	//methods:- functionalities/ functions / behaviour
    eg: 

	class  Student{
	  
	
	}

	class  Customer{
	
	
	}
   
    class  Doctor{
	
	
	}

	class Patient{
	    
		  //data---->properties--->variables

		  //methods------>behaviour
	
	}

	//variable
	//methods


	//Object:

	   Real world  object:-
	      
		  1. properties and functionalities

	   Software object:-

	      It is a small physical memory generated for class.


    syntax for object:
	-----------------

	1. ant real world entity is nothing but an object.
	   Every object has its own properties and functionalities.
	   In a java class ,we can represent every "properties" with the 
	   help of "variables", and  functionalities/behaviour with the
	   help of "methods".

	   every object gets the memory within heap area as the part of JVM.
       
	   ClassName  object_reference_variable=new ClassName();
       Non-static member gets the memory within object.
	   we can access non static / instance member by using object refernce.
	   object:
	     Object
		 object reference
		 object refernce variable

*/

class  Student
{
	//data--variables--properties
    //datatype  variables
	 String      studentName;
	static String      instituteName;

	//functionalities: behvaiour

      void  login(){
	     System.out.println("This is login function/method");
	  }

	  void logout(){
	     System.out.println("This is logout function/method");
	  }

	  public static void main(String[] args){
	     
		     Student s1=new Student();

			  Student s2=new Student();

			   Student s3=new Student();
               
			    System.out.println("address for s1:: "+s1.hashCode());

			   System.out.println("s1 studentName:: "+s1.studentName);
			   System.out.println("s1 instituteName:: "+s1.instituteName);

               System.out.println("address for s2:: "+s2.hashCode());
			   System.out.println("s2 studentName:: "+s2.studentName);
			   System.out.println("s2 instituteName:: "+s2.instituteName);
               
			   System.out.println("address for s3:: "+s3.hashCode());
			   System.out.println("s3 studentName:: "+s3.studentName);
			   System.out.println("s3 instituteName:: "+s3.instituteName);
	  
	  }

}