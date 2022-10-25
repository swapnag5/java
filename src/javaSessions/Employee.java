package javaSessions;

public class Employee {
	
	String name;
	int age;
	double salary;
	boolean isActive;
	

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.name = "SaiRam";
		emp.age = 20;
		emp.isActive = true;
		
		System.out.println(emp.name+" : "+emp.age+" : "+emp.isActive);
		
		Employee emp1 = new Employee();
		emp1.name = "Jaya";
		emp1.age = 31;
		emp1.isActive= false;
		
		System.out.println(emp1.name+" : "+emp1.age+" : "+emp1.isActive);
				
		
		new Employee();//no reference object
		
		Employee e=new Employee();
		e=null;//null ref object
		e.name="aira";
		System.out.println(e.name);//null pointer exception
		}

}
