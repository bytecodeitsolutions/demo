class MethodDemo4 
{
	static int  a=10;
	 static MethodDemo4  obj1=null;
	public static void main(String[] args) 
	{
		
		 System.out.println("first way:: "+a);
		 System.out.println("second way way:: "+MethodDemo4.a);
		 obj1=new MethodDemo4();
		 System.out.println("third way way:: "+obj1.a);
		 Test5.t1=new Test5();
		 Test5.t1.m1();
	}
}
class Test5
{
	static Test5 t1=null;
	void m1(){
		
		 System.out.println("second way way:: "+MethodDemo4.a);
		
		 System.out.println("third way way:: "+MethodDemo4.obj1.a);
	
	}
}
