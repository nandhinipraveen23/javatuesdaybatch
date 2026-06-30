package day1;

 

 /*
  * we can overload the main method
  */
public class Test2 {

   public static void main(int args) {
		 
		 	System.out.println("im from one int arg");
	}
   
   public static void main( ) {
		 
	 	System.out.println("no arg");
}
   
   public static int main(String a ) {
		 
	 	System.out.println("no arg");
	 	return 2;
}
   
   
   public static void main(String[] args) {
		 
	 	System.out.println("string args");
	 	main();
	 	main(34);
	 	
}
   

}
