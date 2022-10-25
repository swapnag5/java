package javaAssignments;

public class PrintOddNums {

	public static void main(String[] args) {

		int i = 1;
		System.out.println("----");
		while(i<=100)
		{
			
			if (!(i%2==0))
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
