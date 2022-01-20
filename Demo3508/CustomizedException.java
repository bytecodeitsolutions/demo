import java.util.Scanner;
class CustomizedException 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter your age and check for eligibility to marry");
	    int age=s.nextInt();
		if(age<21){
		   throw new TooOldException("You are too old , god is calling");
		}
		else if(age>60){
			throw new TooYoungException("You are a baby boy.. wait for some time then you will get abest match");
		}
		else{
		   System.out.println("Your age is :: "+age +" your are eligible for marry");
		}
	}
}
class TooOldException extends RuntimeException
{
       TooOldException(String message){
	      super(message);
	   }
}
class TooYoungException extends RuntimeException
{
    TooYoungException(String message){
		super(message);
	}
}
