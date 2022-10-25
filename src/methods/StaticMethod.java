package methods;

public class StaticMethod {
	
	String name;
	int age;
	
	
	public static void getMail()
	{
		System.out.println("get mail");
	}
	public void sendMail()
	{
      System.out.println("send mail");	
    }
	
	

	public static void main(String[] args) {

		StaticMethod sm=new StaticMethod();
        //1.calling static method directly 
		getMail();
		//2.calling static method using classname
		StaticMethod.getMail();
		sm.sendMail();
	
	}

}
