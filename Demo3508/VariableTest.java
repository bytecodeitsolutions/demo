class Test 
{
	static int  a;
	int  b=20;
	static Test  t1;
	public static void main(String[] args) 
	{
		Test.a=100;
		int c=30;
		System.out.println("Static variable:: "+Test.a);
       Test t1=new Test();
		System.out.println("NonStatic variable:: "+t1.b);

		System.out.println("Local variable:: "+c);
          Test1.m1();

	}
}
class Test1
{
	static void  m1(){

		System.out.println("21-->Static variable:: "+Test.a);
		Test  t2=new Test();
		System.out.println("23-->NonStatic variable:: "+t2.b);
		
	}
}