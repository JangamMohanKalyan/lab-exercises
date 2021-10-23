package wrapperclasses;

public class Valuofmethod
{
		public static void main(String args[])
		{  
		//Converting int into Integer  
		int a=100;
		int b=200;
		int c=300;
		int d=400;
		int e=500;
		byte ba=10;
		
		Integer i=Integer.valueOf(a);
		Integer j=Integer.valueOf(b);
		Integer k=Integer.valueOf(c);
		Integer l=Integer.valueOf(d);
		Integer m=Integer.valueOf(e);//converting int into Integer explicitly  by using value till 1.5v
		Byte bo=Byte.valueOf(ba);
  
		System.out.println(i.getClass().getName());
		System.out.println(j.getClass().getName());
		System.out.println(k.getClass().getName());
		System.out.println(l.getClass().getName());
		System.out.println(m.getClass().getName());
		
		System.out.println(bo.getClass().getName());
		}
}  


