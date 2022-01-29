class Test
{
	private int  a;

	void m1(int  x){
	   this.a=x;
	}

	int  m2(){
	 return a;
	}

	public static void main(String[] args){
	    Test  obj1=new Test();
		obj1.m1(10);
		int  b=obj1.m2();

		System.out.println(b);
	}
}