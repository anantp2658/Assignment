package assignments;
//WAP to check condition statements of If Elseif else
public class Assignment_101 
{
	public static void main(String[] args) 
	{
		int age=66;
		char gender='M';
				
		if((gender=='M' || gender=='F') && (age>=18 && age <=65))
		{
			System.out.println("You can travel");
			System.out.println("Please Pay Full Amout of 100 Ruppies");
		}
		else if((gender=='M' || gender=='F') && (age>65 && age <=100))
		{
			System.out.println("You can travel");
			System.out.println("Please Pay Half Amount or 50 Rupees");
		}
		else if((gender=='M' || gender=='F') && (age>=0 && age<=17))
		{
			System.out.println("You can travel");
			System.out.println("You Can travel Free");
		}
		else 
		{
			System.out.println("Invalid Age");
		}
	}

}
