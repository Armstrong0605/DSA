package Patterns;

public class quest15 {
	
	public static void main(String [] args)
	{
		int a = 5;
		
		for (int i=1; i<=a; i++)
		{
			int space = a-i;
			
		for (int j=1; j<=space; j++)
		{
			System.out.print(" ");
		}
		for (int j =1; j<=(2*i)-1; j++)
		{
			if (j==1 || j == (2*i)-1 || i==1)
			{
				System.out.print("*");	
			}
			else 
			{
				System.out.print(" ");
			}
	
		}
		System.out.println();
		}
		for (int i=1; i<=2*a; i++)
		{
			int space = i-1;
			
		for (int j=1; j<=space; j++)
		{
			System.out.print(" ");
		}
		for (int j =1; j<=(2*(a-i))+1; j++)
		{
			if (j==1 || j == (2*(a-i))+1 || i==a)
			{
				System.out.print("*");	
			}
			else 
			{
				System.out.print(" ");
			}
			
	}
		System.out.println();

}
}
}