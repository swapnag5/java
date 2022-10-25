package javaSessions;

public class StringConcept {

	public static void main(String[] args) {
		
		// String is a predefined class and non primitive data type
		 

		String s = "hi";
		String s2 = "Selenium";
		
		System.out.println(s+s2);//hiSelenium
		
		int a = 20;
		int b = 30;
		System.out.println(a+b+s+s2);//50hiSelenium
		System.out.println(s+s2+a+b);//hiSelenium2030
		System.out.println(s+s2+(a+b));//hiselenium50
		System.out.println(s+a+b+s2);//hi2030Selenium
		
		System.out.println(9/3);//3
		System.out.println(0/9);//0
		//System.out.println(9/0);//Arithmetic Exception
		System.out.println(9/0.0);//Infinity
        System.out.println(9.0/0.0);//Infinity
        System.out.println(0.0/0.0);//NaN
        System.out.println(0/0.0);//NaN
        System.out.println(0.0/0);//NaN
	}

}
