package day2;

import java.util.Scanner;

public class IfExamples {

	public static void main(String[] args) {
	 // byte(nextByte()), short(nextShort()), int (nextInt()), long (nextLong())
		//float (nextFloat()
		
		byte a;// 127
		short b;
		int c;
		long d;
		
		float e;
		double f;
		Scanner s = new Scanner(System.in);
		
		 System.out.println("Enter the byte data :");
		 
		 a=s.nextByte();
 System.out.println("Enter the short  data :");
		 
		 b=s.nextShort();// 32767
		 
		 
 System.out.println("Enter the int data :");
		 
		 c=s.nextInt();
		 
 System.out.println("Enter the long data :");
		 
		 d=s.nextLong();
		 
 System.out.println("Enter the flaot data :");
		 
		 e=s.nextFloat();
		 
 System.out.println("Enter the double data :");
		 
		 f=s.nextDouble();
		 System.out.println("the byte data is: "+a);
		 System.out.println("the short data is: "+b);
		 System.out.println("the int data is: "+c);
		 System.out.println("the long data is: "+d);
		 
		 System.out.println("the float data is: "+e);
		 System.out.println("the double data is: "+f);
	}

}
