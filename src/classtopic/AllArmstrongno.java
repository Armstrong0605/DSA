package classtopic;

import java.util.Scanner;

public class AllArmstrongno 


{

	public static void main (String[] args)
	{
	/*	Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		boolean c = isArmstrong(a);
		System.out.println(c); */
		
		for (int i =100; i<1000; i ++)
		{
			if (isArmstrong(i))
			{
				System.out.print(i + " ");
			}
		}
	}
	static boolean isArmstrong(int a)
	{   
		int b = a;
		int sum =0;
		while (a>0)
		{
           int remainder = a %10;
			a = a/10;
			sum+= remainder*remainder*remainder;
		}
		return sum == b;
	}
}
