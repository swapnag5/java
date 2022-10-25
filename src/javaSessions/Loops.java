package javaSessions;

public class Loops {

	public static void main(String[] args) {

		//while loop
		//the stmt never executes until the condition is satisfied
		//when number of iterations are not fixed
		
		int i = 1;
		while(i<=20)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
			i++;
		}
		//
//		while(true) 
//		{
//			System.out.println("Hi"); //prints infinite times coz its always true
//		}
		
//		while(false) //compiler error :unreachable code bcoz it is false
//		{
//			System.out.println("bye");
//		}
		
		boolean flag = false; //no error bcoz the flag value may change later in future
		while(flag)
		{
			System.out.println("bye");
		}
		
		
		//for loop:
		//when number of iterations are fixed
		System.out.println("-------");
		for(int j=0; j<=10; j++)
		{
			System.out.println(j);
		}
		
		//1.
//		for(int k=1;k<10;)// it is also valid no error
//		{
//			System.out.println(k);// but gives infinite k value bcoz we didnt increase or decrease k value
//		}
		
		//2.
		
//		for(;;) //also valid but by default it takes true so gives infinte times
//		{
//			System.out.println("hi");
//		}
		
		//3.
//		for(;true;) //no error bcoz always true but prints infinte times
//		{
//			System.out.println("hi");
//		}
		
		//4.
//		for(;false;) //compiler error: unreachable code bcoz its false
//		{
//			System.out.println("bye");
//			
//		}
		
		//5.
		boolean flag1 = false;
		for(;flag1;) //no error bcoz flag value may change in future
		{
			System.out.println("hi");
		}
		
		System.out.println("-------");
		for(int k=10; k>0 ; k--)
		{
			System.out.println(k);
		}
		
		System.out.println("-------");
		//print ASCII values from a to z
		for(char c='a';c<='z';c++)
		{
			System.out.println(c+" : "+(int)c);
		}
		//print ASCII values from A to Z
				for(char c='A';c<='Z';c++)
				{
					System.out.println(c+" : "+(int)c);
				}
         //print ASCII values for 0 to 9
				for(char c='0';c<='9';c++)
				{
					System.out.println(c+" : "+(int)c);
				}
				
	//do-while loop : the statement executes at least once before checking the condition
				System.out.println("-------");

				int a=1;
				do {
					System.out.println(a);
					a++;

				}while(a<=10);
	}

}
