package day2;

import java.util.Scanner;

public class IfExamples5 {

	public static void main(String[] args) {
	   
		Scanner s = new Scanner(System.in);
		 int age;
		 System.out.println("Enter the age: ");
		 age= s.nextInt();
		  
		 if(age >=18)
	     System.out.println("u r eligible for vote");
		  
		 else
			 System.out.println("u r not eligible for vote u have to wait for"+(18-age)+"years");

		 System.out.println("im outside");
		 	 
		  
		 
		 
  
	}

}
