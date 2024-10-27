package classtopic;

import java.util.Scanner;

public class switchexmple {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		String fruit = sc.next();
		
		if (fruit.equals("Apple"))
		{
			System.out.println("Red in colour");
		}
		
		switch(fruit)
		{
		case " Apple" -> System.out.println ("Red in colour");
		case "Mango" ->  System.out.println("Yellow in colour");
		case "Orange" -> System.out.println("Its my Birthday");
		default -> System.out.println("Give fruit name");
		}
	}

}
