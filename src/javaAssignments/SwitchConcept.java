package javaAssignments;

public class SwitchConcept {

	public static void main(String[] args) {

		String member = "Admin ";
		switch(member.toLowerCase().trim())
		{
		case "manager":
			System.out.println("login for customer");
			break;
		case "admin": 
			System.out.println("login for admin");
			break;
		case "employee" : 
			System.out.println("login for employee");
			break;
		default:
		    System.out.println("Enter a correct member");
		
		}
		
		String browser="firefox";
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch chrome");
			break;
		case "opera":
			System.out.println("launch chrome");
			break;
		case "safari":
			System.out.println("launch chrome");
			break;
		default:
			System.out.println("please provide a valid browser :"+browser);
			break;
		}
		System.out.println();
	}

}
