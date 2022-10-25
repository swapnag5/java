package javaAssignments;

public class ASCIIUsingWhile {

	public static void main(String[] args) {

		//print ASCII table
		char c = 'a';
		while(c<='z')
		{
			System.out.println(c+ " : "+(int)c);
			c++;
		}
		System.out.println("_________");
		char c2 = 'A';
		while(c2<='Z')
		{
			System.out.println(c2+ " : "+(int)c2);
			c2++;
		}
		System.out.println("_________");
		char c3 = '0';
		while(c3<='9')
		{
			System.out.println(c3+ " : "+(int)c3);
			c3++;
		}
	}

}
