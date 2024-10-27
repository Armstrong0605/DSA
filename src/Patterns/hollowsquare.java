package Patterns;

public class hollowsquare 

{
	public static void main (String [] args)
	{
		int a= 5;
		
		for (int i=1; i<=a;i++)
		{
			for (int j=i-3; j<=i;j++)
			{
				if (j== i-3 || j == i || i ==a ||i==1)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
				
			}
		 System.out.println();
	}

}
}