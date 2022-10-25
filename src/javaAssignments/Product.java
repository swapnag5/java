package javaAssignments;

import java.util.Arrays;

public class Product {

	

	public String[] getEmpProducts(String empName)
	{
		//String product[]=new String[3];
		System.out.println("emplaoyee name is :"+empName);
		switch (empName.toLowerCase().trim()) {
		case "sita":
//			 product[0]="iphone";
//			 product[1]="mac";
//			 product[2]="ipad";
		{
			 String product[]= {"mac","ipad","iphone"};
			 return product;
		}//break;
		case "ram":
		    {
			 String product[]= {"samsung","laptop"};
			 return product;
			}
		case "sai":
			{
			 String product[]= {"samsung","laptop","mouse","keyboard"};
			 return product;
			}
		default:
			System.out.println("name is not found");
			break;
		}
		//return product;
		return null;
	}
	public String[] getItem(String customerName)
	{
		System.out.println("the customer name is:"+customerName);
		if(customerName.equals("Jai"))
		{
			String item[]= {"phone","ipad","laptop","tv"};
			return item;
		}
		else if(customerName.equals("Sai"))
		{
			String item[]= {"keyboard","mouse","monitor"};
			return item;
		}
		else if(customerName.equals("Shyam"))
		{
			String item[]= {"phone","tab","xbox"};
			return item;
		}
		else
		{
			System.out.println("customer not found");
			return null;
		}
	}
	public static void main(String[] args) {

		Product p=new Product();
		String products[]=p.getEmpProducts("Sita");
		System.out.println(Arrays.toString(products));
	//	for(String e:products)
	//	{
	//		System.out.println(e);
	//	}
		
		Product p1=new Product();
		String items[]=p1.getItem("Jai");//the method returns an array so we need to store it as an array
		System.out.println(Arrays.toString(items));
	}
	
	

}
