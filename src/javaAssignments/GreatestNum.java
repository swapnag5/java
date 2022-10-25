package javaAssignments;

public class GreatestNum {

	public static void main(String[] args) {

       int x=70;
       int y=80;
       int z=40;
       int a=85;
       
       if(x>y && x>z && x>a)//false&&true&&false=false
       {
    	   System.out.println("x is the greatest number");
       }
       else if(y>z && y>a)
       {
    	   System.out.println("y is the greatest number");
    	  
       }
       else if(z>a)
       {
    	   System.out.println("z is the greatest number");
       }
       else
       {
    	   System.out.println("a is the greatest number");
       }
	}

}
