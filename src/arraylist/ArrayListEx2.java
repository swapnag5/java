package arraylist;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {

		ArrayList<String> colorList=new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Yellow");
		colorList.add("Blue");
		colorList.add("Pink");
		
		System.out.println(colorList);
		
		for(String e:colorList)
		{
			System.out.println(e);
		}

	}

}
