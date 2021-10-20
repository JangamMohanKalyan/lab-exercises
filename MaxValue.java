package arrays;

public class MaxValue
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {10,25,30,45,60};
		int max=a[0];// intialize and declaring the max variable to the index first value
		for ( int i=0; i<a.length;i++)
		{
			
			if (a[i]>max)
			{
		     max=a[i];
				
			}
			
		}
		System.out.println(max);//printing the maximum value 
	}
		
	}


