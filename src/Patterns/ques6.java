package Patterns;

public class ques6 {
	
	public static void main(String[] args)
	{
		int a = 5;
		
		for (int i=1; i<=a; i ++)
		{
			int space = a-i;
			
			for ( int j =1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
