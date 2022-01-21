class MethodDemo3 
{
	static MethodDemo3 obj1=null;

	public static void main(String[] args) 
	{
        
        obj1=new MethodDemo3();
		obj1.m1();
		
		System.out.println("main ::"+obj1.hashCode());
	}

	static void  m1(){
		
		obj1.m2();
		obj1.m3();
	 System.out.println("m1 "+obj1.hashCode());
	}

	void m2(){
	 System.out.println("m2 ::"+this.hashCode());
	}

	void m3(){
	  System.out.println("m3::"+this.hashCode());
	}
}
