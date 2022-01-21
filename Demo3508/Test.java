/*
  Types of methods:
  -----------------
  a) static method
  b) non static methods / instance method

  a)void return type method
  b)non void return type method

  a) parameterized method
  b) non parameterized method
************************************************************************
  a) user defined method:
  ------------------------
  b) predefined method:==>java ===>JSE===>jdk==>java compiler , jvm , jre 
  other tools + libraries===>packages===>classes & interfaces ===>methods

  ------------------------------>predefined method

  System.out.println();=========> to print output

  class Test{
     public static void main(String[] args){

	    System.out.println();//--------------->zero parameter

		System.out.println("hello program");

		println()------------>predefined method------> which is vailable 
		within PrintStream class.

		out------------------>where? :  out is a static variable vailable in
		System class.

		System--------------->where ??  It is a class vailable in java.lang
		package.




	 
	 }
  }
  -----------------------

  class  System{
     
	 public static PrintStream out;
  
  }
*/

class PrintStream1
{
	void println1(){
	   System.out.println("This is from Prinstream1 class println1 method");
	}
}
class System1
{

    static PrintStream1  out1=null;
}

class Test
{
	public static void main(String[] args){
		System1.out1=new PrintStream1();

	     System1.out1.println1();

		 System.out.println();
	}
}