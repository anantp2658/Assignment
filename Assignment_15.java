package assignments;
//WAP for calling NonStatic method inside the same class
public class Assignment_15 
{
	void add()		 //Non Static method
	{
		System.out.println("I am add Method");
	}
	static void sub() // Static method
	{
		System.out.println("i am substract method");
	}
	public static void main(String[] args) 
	{
		sub();
		new Assignment_15(); // we can call non static method by creating an object
	}
}