package fibinocciseries;

public class FibinacciwithoutRecursion
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int n3=0;
		int m=10;
		for (int a=0;a<=m ;a++ )
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}


}
