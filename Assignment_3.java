package assignments;
public class Assignment_3  
//WAP on arithmatic operators where we will be creating 1 method for 1 operator 
{
	static void add()
	{
		int a=10;
		int b=20;
		int c =a+b;
		System.out.println(c);
	}	
	static void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	static void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
	static void div()
	{
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println(c);
	}
	static void mod()
	{	int a=10;
		int b=20;
		int c=a%b;
		System.out.println(c);		
	}			
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}
}