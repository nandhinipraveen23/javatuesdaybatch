package day1;
/*
 * can we override the main method
 */
class Parent1
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
		 System.out.println("i can add 2nos parent");
	 }
}

class Child1 extends Parent1{
	void sub()
	{
		System.out.println("i can do subraction");
	}
	public static void add()
	 {
		 System.out.println("i can add 2nos child");
	 }
	}
public class Test4 {
    public static void main(String[] args) {
    	String[] fruits= {"apple","kiwi"};
		Child1 c = new Child1();
		c.show();
		c.add();
		c.main(fruits);
	  
	 	
}
   

}
