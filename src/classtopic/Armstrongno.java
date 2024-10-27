package classtopic;

import java.util.Scanner;

public class Armstrongno 

{
 public static void main (String [] args)
 {
	 Scanner sc = new Scanner (System.in);
	 int a = sc.nextInt();
	 int b=a;
	 int sum =0;
	 
	 while (a>0)
	 {
		 int rem = a % 10;
		 a = a/10;
		 sum += rem *rem *rem;
		 
	 }
	 
	if (sum==b)
	{
		System.out.println ("Armstrong no");
	}
	else
	{
		System.out.println ("Not a Armstrong no");
	}
	 
	 
	
	 
 }
}
