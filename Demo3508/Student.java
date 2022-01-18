class Student
{
    //declaring non static variable
	String sname;
	String cname;
	int sid;
	String saddress;

	//declaring static variable
	static String colname;
	static String caddress;
	
	public static void  main(String[] args){//no==JVM==runtime==from main
	    Student  s1=new Student();

		Student  s2=new Student();
		s1.sname="raja";
		s1.cname="MBBS";
		s1.sid=111;
		s1.saddress="kanpur";
		s1.colname="HBTU";
		s1.caddress="kanpur nagar";

		s1.displayDetails();

		s2.sname="rani";
		s2.cname="MD";
		s2.sid=222;
		s2.saddress="lucknow";

		s2.displayDetails();
		s2.displayDetails();
	}

	void displayDetails(){
          System.out.println(this.hashCode());
	    System.out.println("Student name is:: "+sname);
		System.out.println("Student id is:: "+sid);
		System.out.println("Student address is:: "+saddress);
		System.out.println("Student course name is:: "+cname);

		System.out.println("Student college name  is:: "+colname);
		System.out.println("Student college address is:: "+caddress);
	}

}

 