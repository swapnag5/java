package polymorphism;

import java.util.Arrays;

public class FoodDelivery {
	
	//swiggy app:
	//login feature
	public void doLogin(String phNo)
	{
		System.out.println("login with phone number : "+phNo);
	}
	public void doLogin(String un,String pwd)
	{
		System.out.println("login with username and pwd : "+un+" "+pwd);
	}
	public void doLogin(String un,String pwd,String role)
	{
		System.out.println("login with username and pwd : "+un+" "+pwd+" "+role);
	}
	
	//search restaurants
	
	public void searchRestaurant(String restName)
	{
		if(restName.equalsIgnoreCase("Taj Hotel"))
		{
		System.out.println("restaurant found "+restName );
		}
		else
			System.out.println("restuarant not found :"+restName);
	}
	public String[] searchRestaurant(String restName,String location)
	{
		System.out.println("restaurant name "+restName+"location "+location);
		if(location.equalsIgnoreCase("Hyderabad"))
		{
			String restList[]= {"Paradise","Bawarchi","Swagath","Sneha"};
			return restList;
		}
		else if(location.equalsIgnoreCase("Bangalore"))
		{
			String restList[]= {"Swathi","Anjappar","IraniCafe"};
			return restList;
		}
		else
		{
			System.out.println("restaurant not found :"+restName);
		}
		return null;

	}
	public String[] searchRestaurant(String restName,String location,int distance)
	{
		if(location.equalsIgnoreCase("Delhi"))
		{
			if(distance<10)
			{
				
			    String restList[]= {"Biryaniz","Swathi Tiffins","Paradise"};
			    return restList;
			}
			else 
			{
				System.out.println("Thera are no restuarants under 10miles");
			}
			return null;

		}
		System.out.println("provide correct location :"+location);

		return null;
		
	}
	public String[] searchRestuarant(String restName,String location,int distance,int rating )

	{
		if(location.equalsIgnoreCase("Hyderabad"))
		{	
		 if(distance<10)
		 {
		  if(rating>4)
		  {
           String restList[]= {"Cafe","AnandBhavan","Chutnys"};
           return restList;
          }
		  else
		  {
			  System.out.println("There are no restaurants found ");
		  }
		  return null;
		 }
		 System.out.println("No restuarants found under 5 miles");
		 return null;
		}
		System.out.println("provide correct location "+location);
				
		return null;
	}
	
	//order food
	public void orderFood(String foodName)
	{
		if(foodName.equalsIgnoreCase("Biryani"))
		{
		System.out.println(foodName);
		}
		else if(foodName.equalsIgnoreCase("FriedRice"))
		{
			System.out.println(foodName);
		}
	}
	public void orderFood(String foodName , String foodType )
	{
		System.out.println("food name ="+foodName+"\n"+"veg/nonveg ="+foodType);
	}
	public void orderFood(String foodName, String foodType,int quantity)
	{
		System.out.println("food name :"+foodName+" veg/nonveg :"+foodType+" quantity :"+quantity);
	}
	
	public static void main(String[] args) {

		FoodDelivery fd=new FoodDelivery();
		//login
		fd.doLogin("987456382");
		fd.doLogin("admin", "admin123");
		fd.doLogin("Sai", "ram123", "customer");
		//search restaurant
		fd.searchRestaurant("Paradise");
		String restList[]=fd.searchRestaurant("Paradise", "Hyderabad");
		System.out.println(Arrays.toString(restList));
		
		String restList1[]=fd.searchRestaurant("Paradise", "delhi", 4);
		System.out.println(Arrays.toString(restList1));
		
		String restList2[]=fd.searchRestuarant("Paradise", "Hyderabad", 9, 5);
		System.out.println(Arrays.toString(restList2));
		//order food
		fd.orderFood("Rice");
		fd.orderFood("FriedRice", "nonveg");
		fd.orderFood("biryani", "nonveg", 4);
		

		
	}

}
