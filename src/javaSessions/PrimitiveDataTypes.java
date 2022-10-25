package javaSessions;

public class PrimitiveDataTypes {

	public static void main(String[] args) {

		/** 1.Primitive--total 8 primitive data types
		 *               ((byte,short,int,long,float,double,char,boolean))
		 *  
		 *  1.1: Numeric Values Type:
		 *       byte,short,int,long,float,double,char
		 *       
		 *  1.2: Boolean Type:
		 *         boolean--true/flase     
		 */
		
		//byte
		//size: 1 byte==>8 bits
		//range: -128 to 127
		  byte b=2;
		  System.out.println(b);
		  
		//short
		  //size: 2 bytes==> 16 bits
		  //range: -32468 to 32468
		  
		  short s = 23;
		  System.out.println(s);
		
		//int
		  //size: 4 bytes ==> 32 bits
		  //range: -2147483468 to 2147483468
		  
		  int i = 1898;
		  System.out.println(i);
		  
		//long
		  //size: 8 bytes==> 64 bits
		  //range: 15 digits
		  long l = 473829;
		  long l2 = 54933278234L;//we have to give L/l at the end of the big number
		  
		  System.out.println(l);
		  System.out.println(l2);
		  
		//float
		  //size: 4 bytes
		  //range: after . upto 7 digits
		  
		  float f = 34.67f;
		  System.out.println(f);
		  
		//double
		  //size: 8 bytes
		  //range: after . upto 16 digits
		  
		  double d = 34.267283;
		  System.out.println(d);
		  
		//char (Numeric value type--by default java considers numeric values 
		  //size: 2 bytes
		  //range: a-z ==> 97 t0 122
		       // A-Z ==> 65 to 90
		       // 0-9 ==> 48 to 57	
		  
		  char c = 'a';
		  char c2 = '4';
		  System.out.println(c);
		  System.out.println(c2);
		  System.out.println((int)c);//print ASCII value of a is 97
		  System.out.println(c+c2);//when we perform any arithmetic operation it takes ASCII values by default
		  
		  
		//boolean
		  //size: 1 bit
		  //range: true/false
		  
		  boolean flag = true;
		  System.out.println(flag);
	}

}
