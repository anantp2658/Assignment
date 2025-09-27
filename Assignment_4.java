package assignments;
//WAP to add 3 numbers all of int type
public class Assignment_4 
{
	static void addbyte()
	{
		byte a=10;
		byte b=20;
		byte c=30;
		int sum=a+b+c;
		System.out.println(sum);
	}
	static void addshort()
	{
		short a=2000;
		short b=3000;
		short c=4000;
		long sum=a+b+c;
		System.out.println(sum);
	}
	static void addint()
	{
		int a=10;
		int b=20;
		int c=30;
		int sum=a+b+c;
		System.out.println(sum);
	}
	static void addlong()
	{
		long a=111111l;
		long b=222222l;
		long c=333333l;
		long sum=a+b+c;
		System.out.println(sum);
	}
	static void addfloat()
	{
		float a=11.11f;
		float b=22.22f;
		float c=33.33f;
		float sum=a+b+c;
		System.out.println(sum);
	}
	static void addDouble()
	{
		double a=1111.1111;
		double b=2222.2222;
		double c=3333.3333;
		double sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		addbyte();
		addshort();
		addint();
		addlong();
		addfloat();
		addDouble();
	}
	
}
