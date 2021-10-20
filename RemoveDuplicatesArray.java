package arrayslogbook;

public class RemoveDuplicatesArray
{
	
	public static int modifiedArray(int []arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		//Sort the array in descending order
		int temp=0;
		 for (int i = 0; i < arr.length; i++) {     
		        for (int j = i+1; j < arr.length; j++) {     
		           if(arr[i] > arr[j])
		           {    
		               temp = arr[i];    
		               arr[i] = arr[j];    
		               arr[j] = temp;    
		           }     
		        }     
		    }
		 for (int i=0; i<arr.length;i++)
			{
				System.out.println(arr[i]+"  ");
			}
		
		return arr[6];
		
		}
		
	public static void main(String[] args)
	{
		int [] arr= new int [] {1,2,3,3,4,5,5};
		System.out.println("Index of the array"+"  "+modifiedArray(arr));
		
	}

}
