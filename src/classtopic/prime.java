package classtopic;

import java.util.Scanner;

public class prime 

{
	public static void main (String[] args)
	{
		
   Scanner sc = new Scanner (System.in);
   int a = sc.nextInt();
   boolean b = true;
   
   if (a<=1)
   {
	   b = false;
	   System.out.println ("Not a prime");
	   
   }
   else
   {
    for (int i= 2; i<a; i++)
    {
    	if (a%2==0)
    	{
    		b = false;
    		break;
    	}
    }
    if (b)
    {
    	System.out.println("Prime");
    }
    else
    {
    	System.out.println ("Not a prime");
    }
}
}
}