package day2;

import java.util.Scanner;

public class IfExamples7 {

	public static void main(String[] args) {
	   
		Scanner s = new Scanner(System.in);
		 int age, weight;//>=18 , >=50
		 System.out.println("Enter the age: ");
		 age= s.nextInt();
		 System.out.println("Enter the weight: ");
		 weight= s.nextInt();
		 
		 
		 if(age >=18)
		 {
			 if(weight>=50)
			 {
				 System.out.println("u r eligible to donate the blood");
			 }
			 else
			 {
				 System.out.println("u r in under weight");
			 }
		 }
	     
		 else
			 System.out.println("ur age is not support");

		 System.out.println("im outside");
		 	 
		  
		 
		 
  
	}

}
