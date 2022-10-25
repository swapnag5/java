package polymorphism;

public class MainMethodOverloading {
	
	//main mthd can be loaded but JVM always looks for the main with string array arguments
      
	public static void main(int a) {
		System.out.println("Hi "+a);
	}
	public static void main(int a,int b) {
		System.out.println("Hi "+(a+b));
	}
	public static void main(String[] args) {
		System.out.println("Hi ");
		
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10,20);


	}

}
