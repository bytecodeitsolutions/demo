class Student
{


 void  registration(){
	  System.out.println("This is registration method"); 
	   
}

 void  login(){

	   System.out.println("This is login method"); 
	
		
}
    
   public static void main(String[] args){
       Student  obj1=new Student();
	   obj1.login();
	   obj1.registration();

	    obj1.login();
	   obj1.registration();
	 System.out.println("This is main method");    
   
   }
}

 