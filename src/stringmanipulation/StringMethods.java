package stringmanipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String str="testingtesting";
		//find index of char
		System.out.println(str.indexOf("t"));//1st occurrance
		System.out.println(str.indexOf('t',str.indexOf('t')+1));//2nd occurrence
		System.out.println(str.indexOf('t',str.indexOf('t',str.indexOf('t')+1)+1));//3rd 
		System.out.println(str.indexOf('t',str.indexOf('t',str.indexOf('t',str.indexOf('t')+1)+1)+1));//4th
		//find char at particular index num
		System.out.println(str.charAt(0));
		
		//length of the string
		System.out.println(str.length());
		
		//lCase,uCase
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str);
		
		//contains sequence of chars
		String s1="Selenium Testing";
		System.out.println((s1.contains("m")));
		
		//split the strings and result of the string stored in String array
		String s="Selenium-is-automation-Testing";
		System.out.println(Arrays.toString(s.split("-")));
		String s2[]=s.split("-");
		System.out.println(s2.length);
		System.out.println(Arrays.toString(s2));
		
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		
	    //replace 
		String replace=s.replace("-", "+");
		System.out.println(replace);
		System.out.println(s);
		
		//substring
		System.out.println(s.substring(4));
		System.out.println(s.substring(4,9));

	}

}
