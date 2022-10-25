package javaAssignments;

public class WhileLoop {

	public static void main(String[] args) {
        
		//byte  data type using while loop
	    byte b=1;
		while(b<=10)
		{
			System.out.println(b);
			b++;
		}
		System.out.println("-----------");
		
		//double data type using while loop
		double d=1.0;
		while(d<=10.0)
		{
			System.out.println(d);
			d++;
		}
		
		//char data type using while loop
		System.out.println("-----------");

		char c='a';
		while(c<='z')
		{
			System.out.println(c);
			c++;
		}
	
		System.out.println("-----------");

		char c1 = 'Z';
		while(c1>='A')
		{
			System.out.println(c1);
			c1--;
		}
		
		
	}

}
