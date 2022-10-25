package arraylist;

import java.util.ArrayList;

public class ArrayListAddAtPosn {

	public static void main(String[] args) {
        //Inserting elements into array list at start and last positions
        //In ArrayList,the starting index is always 0, n last index is array list size 
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		System.out.println(al);
		System.out.println(al.size());
		al.add(0,1);
		System.out.println(al);
        //al.add(5,20);//AIOB --al size is 4 u r adding at index 5
		al.add(al.size(),20);
		System.out.println(al);
		
		System.out.println(al.get(2));

	}

}
