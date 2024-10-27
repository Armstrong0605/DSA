package Patterns;

import java.util.Scanner;

public class IncDec {
	
	public static void main (String args []) 
	
	{
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		for ( int i =1; i <a*2; i++)
		{
			int b = i>a?2*a-i :i;
			
			for ( int j=1; j<=b;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

}

