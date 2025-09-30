package assignments;
//WAP for Global Variables
public class Assignment_20 
{
	int noOfDays=365; 		 //Globle Variable
	static int noOfHours=24; //Globle Variable
	
	void days()
	{
		System.out.println(noOfDays);
	}
	void hours()
	{
		System.out.println(noOfHours);
	}
	public static void main(String[] args) 
	{
		System.out.println(noOfHours);
		Assignment_20 a20=new Assignment_20();
		a20.hours();
		a20.days();
	}
	
}