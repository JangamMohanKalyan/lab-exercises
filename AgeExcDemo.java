package exceptionalhandling;

import java.util.Scanner;

public class AgeExcDemo 
{
	 public static void main(String[] args)
		 {
		  Scanner s = new Scanner(System.in);
		  System.out.print("Enter ur age :: ");
		  int age = s.nextInt();
		  try 
		  {
		   if(age < 15) 
		    throw new AgeException("Invalid age");
		   else
		    System.out.println("Valid age");
		  }
		  catch (AgeException caughtException) {
		   System.out.println(caughtException);
		  }
		  System.out.println("hello world");
		 }
		 
	}
