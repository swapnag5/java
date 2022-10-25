package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {

		ArrayList<String> names=new ArrayList<String>();
		
		names.add("Sai");
		names.add("Ram");
		names.add("Jai");
		
		Collections.reverse(names);
		System.out.println(names);
		
		for(String s:names)
		{
			System.out.println(s);
		
		}
		System.out.println("----");
		ArrayList<String> user=new ArrayList<String>();
		user.add("Sita");
		user.add("Nyra");
		user.add("Isha");
		user.add("Gita");
		System.out.println(user);
		
		Collections.sort(user);///prints alphabetical order
		
		for(String s:user)
		{
			System.out.println(s);
		}



		}
		
		
	}

	
	


