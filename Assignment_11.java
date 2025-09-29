package assignments;
//WAP to check condition statements  Nested if
public class Assignment_11 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		if(a!=b)
		{
			System.out.println("statement 1");
			if(a<=b)
			{
				System.out.println("statement 2");
			}
			else if(b>a)
			{
				System.out.println("statement 3");
			}
			else
			{
				System.out.println("statement 4");
			}
		}
		else
		{
			System.out.println("all wrong");
		}
	}
}
