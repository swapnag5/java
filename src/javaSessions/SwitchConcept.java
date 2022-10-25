package javaSessions;

public class SwitchConcept {

	public static void main(String args[]) {
		String name = "Sai";
		switch (name.toLowerCase()) {
		case "sai":
			System.out.println("Hello");
			break;
		case "ram":
			System.out.println("Hello");
			break;
		case "jai":
			System.out.println("Hello");
			break;
		default:
			System.out.println("wrong entry " + name);
			break;
		}
		
		//real time examples using switch case
		//1.Cross browser technique
		String browser = "ie";
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;

		default:
			System.out.println("pass the right browser: "+browser);
			break;
		}
		
		//RBAC(RoleBasedAccessControl): admin,customer,hr,employee
		
		String role = "Admin";
		switch (role.toLowerCase().trim()) {
		case "hr":
			System.out.println("login for hr");
			break;
		case "customer":
			System.out.println("login for customer");
			break;
		case "admin":
			System.out.println("login for admin");
			break;
		case "employee":
			System.out.println("login for employee");
			break;

		default:
			System.out.println("please enter correct role: "+role);
			break;
		}
		
		//environments: QA,Dev,UAT,Stage
		
		String env = "QA";
		switch (env.toLowerCase().trim()) {
		case "qa":
			System.out.println("test cases running on QA env");
			break;
		case "dev":
			System.out.println("test cases running on dev env");
			break;
		case "stage":
			System.out.println("test cases running on stage env");
			break;
		case "uat":
			System.out.println("test cases running on uat env");
			break;
		default:
			System.out.println("pass correct env: "+env);
			break;
		}
		
		
	}

}
