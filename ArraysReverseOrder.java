package arrays;

public class ArraysReverseOrder
{
	public static void main(String[] args)
	{
		int a[]=new int[] {10,25,30,45,60};
		System.out.println("print the elements ");
		//print the elements in an array
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Reverse an array");
		//print the array in reverse order
		for (int i=a.length-1;i>0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
