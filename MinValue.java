package arrays;

public class MinValue 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {10,25,30,45,60};
		int min=a[0];//intialize and declaring the min variable to the index first value
		for ( int i=0; i<a.length;i++)
		{
			
			if (a[i]<min)
			{
		     min=a[i];
				
			}
			
		}
		System.out.println(min);//printing the minimum value of an array
	}

}
