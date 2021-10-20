package stringspractice;

public class StringBuilderExample
{
	public static void main(String[] args) {
		
	StringBuilder sb1=new StringBuilder("Hello");
	StringBuilder sb2=new StringBuilder("Hello");
	sb1.append("Java");//append hello+java
	System.out.println(sb1);
	System.out.println(sb1==sb2);//equal by reference
	System.out.println(sb1.equals(sb2));
	System.out.println(sb1.capacity());//capacity of teh string builder
	sb1.append("program");  
	System.out.println(sb1);
	System.out.println(sb1.capacity());
	sb1.append("hvsjdhfdhsofjsdfsdjfsdbfjfbsdhf");//increasing the capacity of the string builder
	System.out.println(sb1);
	System.out.println(sb1.capacity());
	System.out.println(sb1.getClass().getName());//get class and get name returns the type of object 
	String str=new String(sb1);
	System.out.println(str.getClass().getName());
	sb2.reverse(); //reverse 
	System.out.println(sb2);
	sb1.length();
	System.out.println(sb1);
	sb2.delete(1,3);  //deleting the elements
	System.out.println(sb2);
	}
	

}
