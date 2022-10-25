package stringmanipulation;

public class RevStringSplit {
	
	
	public static void main(String[] args) {
		
		
         //command shift O--->shortcut for importing 
		String str="This is java code";
		String s[]=str.split(" ");
	
		
		int len=s.length;
		
		for(int i=len-1;i>=0;i--)
		{
			//System.out.println(s[i]);
			String s1=s[i];
			String reverse="";
			int length=s1.length();
			for(int j=length-1;j>=0;j--)
			{
				reverse=reverse+s1.charAt(j);
				
			}
			System.out.println(reverse);
			
		}
		
		
	}
}


