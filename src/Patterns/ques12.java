package Patterns;

import java.util.Scanner;

public class ques12 

{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
	    int a = sc.nextInt();
    
    for (int i=1; i<=a; i ++)
    {    
    	int space = i-1;
    	
    	for ( int j =1; j<=space; j++)
    	{
    		System.out.print(" ");
    	}
    	for (int j=i; j<=a; j++)
    	{
    		System.out.print("* ");
    	}
    	System.out.println();
    }
    	for (int i=1; i<=a; i ++)
    	{
    	 int space = a-i;
    	 for (int j=1; j<=space; j++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for (int j =1; j<=i; j++)
    	 {
    		 System.out.print("* ");
    	 }
    
        System.out.println();
    }
}
}