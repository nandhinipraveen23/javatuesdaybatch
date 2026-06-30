package day1;
/*
 * can we override the main method
 * 
 * if u keep child class both side while creating the obj
 * u can access all the properties from the parent also the child
 * so with the help of child obj u can access static method which is available in the child class
 * 
 * if u keep parent to the left side child class to the right side while creating obj
 * it will show only the parent class methods and it will show overrided method
 * 
 * imp: static methods we can't override
 */
class Parent2
{
	public static void main(String[] args)
	{
		System.out.println("im from the parent");
	}
	  
	public  void show()
	 {
		 System.out.println("im the show method from the parent");
	 }
	public static void add()
	 {
		 System.out.println("i can add 2nos parent");
	 }
	void display()
	{
		System.out.println(" im from parent display");
	}
}

class Child2 extends Parent2{
	public static void main(String[] args)
	{
		System.out.println("im from the child");
	}
	void sub()
	{
		System.out.println("i can do subraction");
	}
	public static void add()
	 {
		 System.out.println("i can add 2nos child");
	 }
	
	void display()
	{
		System.out.println(" im from child display");
	}
	}
public class Test5 {
    public static void main(String[] args) {
    	String[] fruits= {"apple","kiwi"};
		Parent2 c = new Child2();
		 c.display();
		 c.add();// parent
		 c.show();//parent
		 c.main(fruits);
	  
	 	
}
   

}
