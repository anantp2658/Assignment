package assignments;
//WAP for Math Class methods   addExact(), subExact(), multiplyExact(),Min(),Max(),abs(),sqrt(),Math.PI;
public class Assignment_14 
{
	public static void main(String[] args) 
	{
		double value=Math.random();
		System.out.println(value);
		System.out.println(Math.addExact(10, 11));
		System.out.println(Math.subtractExact(10, 15));
		System.out.println(Math.multiplyExact(10, 20));
		System.out.println(Math.abs(10));
		System.out.println(Math.min(11, 6));
		System.out.println(Math.max(2, 3));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.PI);
	}
}
