package day1;
/*
 * can we override the main method
 */
class Parent
{
	 public static void main(String[] args) {
		 
		 	System.out.println("string args from parent");
		 	 
	}
	public  void show()
	 {
		 System.out.println("im the show method from the parent");
	 }
	public static void add()
	 {
		 System.out.println("i can add 2nos");
	 }
}

class Child extends Parent{
	
}
 
public class Test3 {

    public static void main(String[] args) {
    	String[] fruits= {"apple","kiwi"};
		Child c = new Child();
		c.show();
		c.add();
		c.main(fruits);
	  
	 	
}
   

}
