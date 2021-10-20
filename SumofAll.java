package arrays;

public class SumofAll 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {10,25,30,45,60};
		int Sum=0;// intialize and declaring the variable
		System.out.println("print the elements ");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Sum of the all the elemenst in the array");
		// logic for sum of all elements in an array
		for (int i=0;i<a.length;i++)
		{
			Sum=Sum+a[i];
		}
		System.out.println(Sum);	
	}

}
