package assignments;
//WAP for Constructor(Parameterized / Non-Parameterized)
public class Assignment_17 
{
	Assignment_17()      //this is Construct Non-Parameterized method
	{
		System.out.println("Non-Parameterized Constructor");
	}
	Assignment_17(int a, double y) //this is Construct Parameterized method
	{
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		new Assignment_17();
		new Assignment_17(1,1.2);
	}
}