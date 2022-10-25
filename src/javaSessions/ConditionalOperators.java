package javaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {


		//if-else
		int a = 30;
		int b = 40;
		
		if(a<b)
		{
			System.out.println("a is less than b");
		}
		else
		{
			System.out.println("a is not less than b");
		}
		
		if(true)
		{
			System.out.println("Hi");
			
		}else//dead code coz if condition is always true so else stmt never execute
		{
			System.out.println("Bye");
		}
		
		if(false)//dead code if stmt is always false it never executed
		{
			System.out.println("Hi");
		}
		else
		{
			System.out.println("Bye");
		}
		boolean flag = true; //
		if(flag)
		{
			System.out.println("Hello");
		}
		else //it is not a dead code coz flag value may change later in future
		{
			System.out.println("ByeBye");
		}
		//nested if
		
		int marks = 95;
		if(marks<=75)
		{
			System.out.println("Grade c");
		}
		else if(marks<=85)
		{
			System.out.println("Grade B");
			
		}
		else if(marks<=100)
		{
			System.out.println("Grade A");
		}
		else
			System.out.println("Invalid marks");
		
		
		
		
	}

}
