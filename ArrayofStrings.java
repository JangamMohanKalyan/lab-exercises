package arrayslogbook;

import java.util.Arrays;

public class ArrayofStrings
{
	public static String sortStrings(String[] arr)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));  
		return arr[0] ;
		
		
	}
	public static void main(String[] args) 
	{
		String [] arr=new String [] {"hello","world","program"};
		System.out.println("Sorting an Array"+"    "+sortStrings(arr));
	
	}
		
			
		
	}
	


