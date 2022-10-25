package javaSessions;

public class IncreAndDecreement {

	public static void main(String[] args) {

		//Post Increment
		
		int a = 2;
		int b = a++;
		System.out.println(a);//3
		System.out.println(b);//2
	    System.out.println(" -----------");
		//pre Increment
		
		int x = 2;
		int y = ++x;
		System.out.println(x);//3
		System.out.println(y);//3
	    System.out.println(" -----------");

		//post decrement
		
		int m = 2;
		int n = m--;
		System.out.println(m);//1
		System.out.println(n);//2
	    System.out.println(" -----------");

		//pre decrement
		
		int u = 2;
		int v = --u;
		System.out.println(u);//1
		System.out.println(v);//1
	}

}
