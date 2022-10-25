package stringmanipulation;

public class StringReverse {
	
	//String doesnt have any default methods for reversing bcoz Strings are immutable
	
	public static String reverse(String str)
	{
		if(str==null)
		{
			System.out.println("null string");
			return null;
		}
		int len=str.length();

		if(len==1) {
			return str;
		}
		
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		return rev;
		
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(reverse("Selenium"));
		System.out.println(reverse("S"));
		//System.out.println(reverse(null));
	}

//		String s="Testing";
//		String rev="";
//		
//		int len = s.length();//length of the string,highest index is length-1
//		for(int i=len-1;i>=0;i--)
//		{
//			 rev=rev+s.charAt(i);
//
//		}
//		System.out.println(rev);
//
//	}

}
