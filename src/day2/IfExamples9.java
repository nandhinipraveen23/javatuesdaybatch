package day2;

import java.util.Scanner;

public class IfExamples9 {

	public static void main(String[] args) {
	   
		Scanner s = new Scanner(System.in);
		   String username="ganga";
		   String password="1234";
		   
		 System.out.println("Enter the username");
		 String u=s.next();
		 System.out.println("Enter the password");
		 String p=s.next();
		 
		 if(username.equals(u) && password.equals(p))
		 {
			 System.out.println("home screen");
		 }
		 else
		 {
			 System.out.println("uname or password wrong");
		 }
  
	}

}
