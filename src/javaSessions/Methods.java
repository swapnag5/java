package javaSessions;

public class Methods {
	
	//method is a small piece of code
	//methods are independant to each other
	//method cannot be created in other method
	
	public void test()
	{
		System.out.println("hi testing");
	}
	public void sum()
	{
		int a= 10;
		int b= 20;
		int sum=a+b;
		System.out.println("a n b sum is"+sum);
		
	}
	//method return some value
	public int getSum()
	{
		int a=30;
		int b = 10;
		int s=a+b;
		return s;
	}
	//method passing parameters and return type
	public int add(int x,int y)

	{
		System.out.println("addition ");
		int z = x+y;
		return z;
	}
	
	//method name-->getStudentMarks
	//input...student name
	//return student marks
	
	public int getStudentMarks(String name)
	{
		
		System.out.println("marks for :"+name);
		int marks = -1;
		if(name.equals("riya"))
		{
			marks = 80;	
		}
		else if(name.equals("Jaya"))
		{
			marks =  90;
		}
		else if(name.equals("Sita"))
		{
			marks = 85;
		}
		else
		{
			System.out.println("plz pass correct student name"+name);
		}
		return marks;
	}
	public static void main(String[] args) {

		Methods m = new Methods();
		m.test();
	   
		m.sum();
	   
		System.out.println(m.getSum());
	   int x = m.getSum();
	   System.out.println(x);
	   
	  int c= m.add(5, 3);
	  System.out.println(c);
	  
	  int n=m.getStudentMarks("ram");
	  System.out.println(n);
	  
	}

}
