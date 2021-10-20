package arrayslogbook;

import java.util.Arrays;

public class ReverseanInteger
{
		public static int getSorted(int [] arr)
		{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));  
			//Reverse of an array
			System.out.println("Reverse an array");
			for (int i=arr.length-1;i>0;i--)
			{
				System.out.println(arr[i]);
			}
			
			return arr[0] ;
			
			
		}
		public static void main(String[] args) 
		{
			int [] arr=new int [] {5,7,4,2,1,19,15};
			System.out.println("Sorting an Array element in the index 0"+"    "+getSorted(arr));
		
		}
			
				
			
		}


