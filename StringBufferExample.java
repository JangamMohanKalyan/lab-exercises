package stringspractice;

public class StringBufferExample 
{
	public static void main(String args[])
	{  
	StringBuffer sb1=new StringBuffer("Hello");
	StringBuffer sb2=new StringBuffer("Hello");
	System.out.println(sb1==sb2);
	System.out.println(sb1.equals(sb2));//equals by reference
	System.out.println(sb1.capacity());
	sb1.append("program");  
	System.out.println(sb1);
	System.out.println(sb1.capacity());
	sb1.append("hvsjdhfdhsofjsdfsdjfsdbfjfbsdhf");
	System.out.println(sb1);
	System.out.println(sb1.capacity());
	System.out.println(sb1.getClass().getName());
	String str=new String(sb1);
	System.out.println(str.getClass().getName());
	sb2.insert(3,"Java");//String was changed 
	System.out.println(sb2);
	
	
	
	
}  
} 



