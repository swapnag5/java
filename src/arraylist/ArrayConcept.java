package arraylist;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array is a collection of elements of same data type.
		//Limitations of an array:
		//1.size is fixed.---To overcome this we have ArrayList concept
		//2.same data type elements only can store in an array.---To overcome this we have 
		//Object array(static)
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//using index based for loop to print values from an array
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println("--------");
		//using enhanced for loop for printing values from an array
		
		for(int r : a)
		{
			System.out.println(r);
		}
		System.out.println("--------");
       
		//double array
		double d[]=new double[3];
		d[0]=2.0;
		d[1]=3.0;
		d[2]=4.0;
		
		for(double r:d)
		{
			System.out.println(r);
		}
		System.out.println("--------");
        //char array
		char c[]=new char[2];
		c[0]='a';
		c[1]='b';
		
		
		for(char r:c)
		{
			System.out.println(r);
		}
		System.out.println("--------");
		 
		//String array
		String s[]=new String[2];
		s[0]="Sai";
		s[1]="Ram";
		
		for(String r:s)
		{
			System.out.println(r);
		}
		

	}

}
