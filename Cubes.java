package sumofcubes;
import java.util.*;

public class Cubes
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Any Number :");
			int a = sc.nextInt();
			int sum=0,n;
			while(a!=0)
			{
			n = a%10;
			sum = sum +(n*n*n);
			a = a/10;

			}
			System.out.println(sum);
			}
		
	}


