package javaAssignments;

public class Employee {

	String name;
	int id;
	double salary;
	
	
	public static void main(String[] args) {
       
		Employee e1=new Employee();
		e1.name="A";
		e1.id=1001;
		e1.salary=20.0;
		Employee e2=new Employee();
		e2.name="B";
		e2.id=1002;
		e2.salary=20.0;
		Employee e3=new Employee();
		e3.name="C";
		e3.id=1003;
		e3.salary=20.0;
		Employee e4=new Employee();
		e4.name="D";
		e4.id=1004;
		e4.salary=20.0;
		
		e1=e2;
		System.out.println(e1.name + ":" + e1.id + ":" + e1.salary);
		System.out.println(e2.name + ":" + e2.id + ":" + e2.salary);
		System.out.println(e3.name + ":" + e3.id + ":" + e3.salary);
		System.out.println(e4.name + ":" + e4.id + ":" + e4.salary);
         
		System.out.println("--------");
		e2=e3;
		
		System.out.println(e1.name + ":" + e1.id + ":" + e1.salary);
		System.out.println(e2.name + ":" + e2.id + ":" + e2.salary);
		System.out.println(e3.name + ":" + e3.id + ":" + e3.salary);
		System.out.println(e4.name + ":" + e4.id + ":" + e4.salary);
		System.out.println("--------");

		e3=e4;
		System.out.println(e1.name + ":" + e1.id + ":" + e1.salary);
		System.out.println(e2.name + ":" + e2.id + ":" + e2.salary);
		System.out.println(e3.name + ":" + e3.id + ":" + e3.salary);
		System.out.println(e4.name + ":" + e4.id + ":" + e4.salary);
		System.out.println("--------");

        e4=e1;
        System.out.println(e1.name + ":" + e1.id + ":" + e1.salary);
		System.out.println(e2.name + ":" + e2.id + ":" + e2.salary);
		System.out.println(e3.name + ":" + e3.id + ":" + e3.salary);
		System.out.println(e4.name + ":" + e4.id + ":" + e4.salary);


         
	}

}
