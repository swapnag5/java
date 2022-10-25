package arraylist;

import java.util.ArrayList;

public class ArrayListconcept {

	public static void main(String[] args) {

		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Sai");
		ar.add("Ram");
		ar.add("Jai");
		
		for(String s:ar)
		{
			System.out.println(s);
		}
		
		ar.remove("Jai");
		System.out.println(ar);
		
		ar.add("Sri");
		ar.add("Nivi");
		System.out.println(ar);
		ar.add(0,"Sunny");
		System.out.println(ar);
		ar.add(3,"Sunny");

		System.out.println(ar);
		System.out.println("--------");

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.addAll(ar);
		System.out.println(ar1);
		System.out.println(ar);
		System.out.println("--------");

		//reverse an arraylist
		for(int i=ar.size()-1;i>=0;i--)
		{
			System.out.println(ar.get(i));

		}
		System.out.println(ar.get(5));

	}

}
