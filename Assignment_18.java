package assignments;
//WAP for Method Overloading(static/non static methods)
public class Assignment_18 
{
	static void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void add(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	void sub(int a, int b)
	{
		int sub=a+b;
		System.out.println(sub);
	}
	void sub(double a, double b)
	{
		double sub=a+b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Its method overloading");
		add(1,5);
		add(1.5, 5.5);
		Assignment_18 a18=new Assignment_18();
		a18.sub(10, 20);
		a18.sub(10.5, 20.5);
		
	}
}