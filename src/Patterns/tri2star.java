package Patterns;

public class tri2star 

{
	
	public static void main (String[] args)
	{
		int a = 5;
		
		for (int i=1; i <=a; i ++)
		{
			int space = i;
			
			for (int j = 1; j<=space; j++)
			{
				System.out.print(" ");
			}
			
		for (int j = i; j<=a;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}

}
