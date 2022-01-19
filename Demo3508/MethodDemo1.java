class MethodDemo1 
{
    //data------>
	//methods--->static method // non static method

	/*
	  1. with parameter

	  2. without parameter
	*/

	void m1(int  a,int  b){
	  System.out.println("value of a is:: "+a);
	  System.out.println("value of b is:: "+b);
	}

	static void m2(int  a,String  s,double  d){
	  System.out.println(s);
	  System.out.println(a);//1000
	   System.out.println(d);//1000
	}

	public static void main(String[] args){
	    MethodDemo1  obj1=new MethodDemo1();
		//non static / instance method calling
		obj1.m1(100,20);

		//static method calling
        MethodDemo1.m2(1000,"raja",100.5);

	}
}
