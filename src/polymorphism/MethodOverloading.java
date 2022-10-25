package polymorphism;

public class MethodOverloading {
	
	//method overloading: 
	//within the same class we have different methods
	//with the same method name
	//with different parameters
	//with different sequence of the parameters
	//the method can be void or String/int/char,etc, with return type
	
	public void test()
	{
		System.out.println("test method");
	}
	public void test(int a)
	{
		System.out.println("test method with 1 param:"+a);
	}
	public void test(int a,String s)
	{
		System.out.println("test method with 2 param:"+a+s);
	}
	public void test(String s,int a)
	{
		System.out.println("test method with 2 params diff sequens:"+s+a);
	}
	public String test(String s)
	{
		System.out.println("test method with return type :"+s);
		return s;
	}
	//real time examples
	//amazon:login
	public void doLogin()
	{
		System.out.println("login without username and pwd");
	}
	public void doLogin(String un,String pwd)
	{
		System.out.println("login without username and pwd"+un+pwd);
	}
	public void doLogin(String un,String pwd,String role)
	{
		System.out.println("login without username , pwd and role"+un+pwd+role);
	}
	public void doLogin(String un,String pwd,String role,int otp)
	{
		System.out.println("login without username , pwd and role and otp"+un+pwd+role+otp);
	}
	
	//search a product
	public void searchProduct(String productName)
	{
		System.out.println("Your product is "+productName);
	}
	public void searchProduct(String productName,String productColor)
	{
		System.out.println("Your product is with color "+productName+productColor);
	}
	public void searchProduct(String productName,String productColor,int size)
	{
		System.out.println("Your product is"+productName+" with color "+productColor+ "and size "+size);
	}
	
	//uber booking
	public void bookingCar(String stPoint,String endPoint)
	{
		
	}
	public void bookingCar(String stPoint,String endPoint,String carType)
	{
		
	}
	public void bookingCar(String stPoint,String endPoint,String carType,int passengers)
	{
		
	}
	public void bookingCar(String stPoint,String endPoint,String carType,int passengers,String couponCode)
	{
		
	}
	
	
	public static void main(String[] args) {

		MethodOverloading m=new MethodOverloading();
		m.test();
		m.test(20);
		m.test(5, "Ram");
		m.test("Sai", 25);
		m.test("Hi");
		
	}

}
