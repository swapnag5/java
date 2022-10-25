package methods;

public class RecursiveMethod {

	public static void m1()
	{
		System.out.println("Hi");
	}
	public static void m2()
	{
		System.out.println("Hi");
	    m2();//recursive method means the method  calling by itself
	}
	public static void main(String[] args) {

		RecursiveMethod.m1();
		RecursiveMethod.m2();
		
	}

}
