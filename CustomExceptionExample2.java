package exceptionalhandling;

import java.util.Scanner;

public class CustomExceptionExample2 extends Exception
{
	
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the first name");
    	String name1=sc.nextLine();
    	Scanner sa=new Scanner(System.in);
    	System.out.println("enter the second name");
    	String name2=sa.nextLine();
    	String name=name1+name2;
    	try
    	{
    		if(name1.isEmpty()|| name2.isEmpty()
    				)
    		{
    			throw new InvalidNameException("not a valid name");
    		}
    		else
    		{
    			System.out.println("valid name");
    		}
    	}
    	catch (InvalidNameException a) {
 		   System.out.println(a);
	
}
}
}

