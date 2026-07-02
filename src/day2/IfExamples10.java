package day2;

import java.util.Scanner;

public class IfExamples10 {

	public static void main(String[] args) {
	   
		Scanner s = new Scanner(System.in);
		  
		 System.out.println("Enter the no:(1.biscut 2.cooldring 3.chips) ");
		 int choice= s.nextInt();
		 
		 switch(choice)
		 {
		 case 1:
			 System.out.println("received the biscut");
			 break;
		 case 2:
			 System.out.println("received cooldring");
			 break;
		 case 3:
			 System.out.println("received chips");
			 break;
			 
			 default: 
				 System.out.println("invalid");
		 }		  
		 
  
	}

}
