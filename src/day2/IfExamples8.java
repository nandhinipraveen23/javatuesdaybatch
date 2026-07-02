package day2;

import java.util.Scanner;

public class IfExamples8 {

	public static void main(String[] args) {
	   
		Scanner s = new Scanner(System.in);
		  
		 System.out.println("Enter the no:(1.biscut 2.cooldring 3.chips) ");
		 int choice= s.nextInt();
		 
		 if(choice==1)
		 {
			 System.out.println("received the biscut");
		 }
		 else if(choice==2)
			 System.out.println("received cooldring");
		 else if(choice==3)
			 System.out.println("received chips");
		 else
			 System.out.println("invalid");
		  
		 
		 
  
	}

}
