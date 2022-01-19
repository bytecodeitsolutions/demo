class Student 
{

	void login(String username,String  password){

	    System.out.println(username);
		System.out.println(password);
	}

	public static void main(String[] args) 
	{
		 Student s1=new Student();
		 s1.login("kayum","ansari");
	}
}
