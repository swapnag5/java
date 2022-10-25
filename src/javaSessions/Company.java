package javaSessions;

import java.util.ArrayList;

public class Company {

	//WAf: get browser info
	//return browser info--[name,version,company]
	
	public ArrayList<Object> getBrowserInfo(String browserName)
	{
		System.out.println("browser info is :"+browserName);
		ArrayList<Object> browserInfoList=new ArrayList<Object>();
		if(browserName.trim().equalsIgnoreCase("chrome"))
		{
			browserInfoList.add("chrome");
			browserInfoList.add(1.29);
			browserInfoList.add("Google Ltd");
		}
		else if(browserName.trim().equalsIgnoreCase("Safari"))
		{
			browserInfoList.add("safari");
			browserInfoList.add(3.29);
			browserInfoList.add("Apple Inc");
		}
		else if(browserName.trim().equalsIgnoreCase("Firefox"))
		{
			browserInfoList.add("firefox");
			browserInfoList.add(4.29);
			browserInfoList.add("Mozilla Ltd");
		}
		else
		{
			System.out.println("browser not found");
		}
		return browserInfoList;
	}
	//cross browser logic
	//WAF: launchbrowser-->input parameter(String)
	//return--boolean(true/false)
	public boolean isBrowserLaunched(String browserName)
	{
		System.out.println("browser is :"+browserName);
		boolean browserLaunched=false;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			browserLaunched=true;
		}
		else if(browserName.equalsIgnoreCase("safari"))
		{
			browserLaunched=true;
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			browserLaunched=true;
		}
		else
		{
			System.out.println("browser is not found");
		}
		return browserLaunched;
	}
	//using switch case
	public boolean isBrowserActive(String browserName)
	{
		boolean flag=false;
		switch (browserName) {
		case "chrome":
			flag=true;
			
			break;
		case "firefox":
			flag=true;
			
			break;
		case "safari":
			flag=true;
			
			break;
		default:
			System.out.println("browser not found");
			break;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		Company cm=new Company();
		
		ArrayList<Object> al=cm.getBrowserInfo("firefox");
		System.out.println(al);
		
		boolean b=cm.isBrowserLaunched("opera");
		System.out.println(b);
		System.out.println("-----");
		if(cm.isBrowserLaunched("safari"))
		{
		System.out.println("enter url");
		}

	}

}
