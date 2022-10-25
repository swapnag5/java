package methods;

public class StaticVars {
	
	//static vars can be used to refer the common property of all objects
	//static var is also called instance var
	//static vars can only be declared inside the class
	//local vars cannot be declared as static
	
	String studentName;
	int age;
	static String collegeName="CBIT";

	public static void main(String[] args) {
		
		StaticVars sv=new StaticVars();
		//to call non static vars : need to create object
		sv.studentName="Divya";
		sv.age=20;
		
		//to call static vars : no need to create obj we can directly call them or 
		//we can use classname
		
		//1.using classname
		System.out.println("student name :"+sv.studentName+" age:"+sv.age+" college:"+StaticVars.collegeName);
		
		StaticVars sv1=new StaticVars();
		sv1.studentName="Sai";
		sv1.age=30;
		//2.calling directly
		System.out.println("student name :"+sv1.studentName+" age:"+sv1.age+" college:"+collegeName);

		
		

		
	}

}
