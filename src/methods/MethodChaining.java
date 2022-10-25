package methods;

public class MethodChaining {
	
	public static void m1()
	{
		System.out.println("hi");
		m2();
	}
	public static void m2()
	{
		System.out.println("hi");
		m3();
	}
	public static void m3()
	{
		System.out.println("hi");
		m1();
	}
	public static void main(String[] args) {

		MethodChaining.m1();//stack overflow error
	
		
	}

}
