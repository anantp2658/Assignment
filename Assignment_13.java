package assignments;
//WAP for Logical operators ( && (AND) , || (OR))
public class Assignment_13 
{
	public static void main(String[] args) 
	{
	int age=101;
	char gender='M';
	
	if((gender=='M' || gender=='F') && (age>=18 && age <=100))
	{
		System.out.println("You can vote");
	}
	else
	{
		System.out.println("you are eligible for vote");
	}
	}	
}	