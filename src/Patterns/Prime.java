package Patterns;
import java.util.Scanner;

public class Prime {
	
	public static void main (String [] args)
	{
	 	Scanner sc = new Scanner ( System.in);
	 	int a = sc.nextInt();
	 	
	    boolean b = true;
	 	
	 	if (a<=1)
	 	{
	 		b=false;
	 	}
	 	
	 	else
	 	{
	 	
	   for (int i=2;i<a;i++)
	   {
		   if (a%i==0)
		   {
			   b= false;
			   break;
		   }
	   }
		   
	 		if (b)
	 		{
	 			System.out.println ("Prime");	
	 		}
	 			
	 		else 
	 		
	 		{
	 			System.out.println("Not a Prime");
	 		}
	 	}
	 	
	 	
	}

}
