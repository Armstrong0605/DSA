package classtopic;

public class Methods {
	
	public static void main (String[] args)
	{
	 /* int c = sum ();
	   System.out.println (c);
	   String a= message();
	   System.out.println(a);
	   Subract (); */
	   
	   
	   Swap();
	   
	}
	static int sum ()
	{
		int a= 20;
		int b = 30;
		int c = a + b;
		return c;
	}
    static String message ()
    {
    	String a = "Hello Boy";
    	return a;
    }
    
    static void Subract ()
    {
    int	a= 30;
    int	b= 20;
    int c = a-b;
    System.out.println(c);
    }
    
   static void Swap ()
   
   {
   int a= 50;
   int b = 20;
	int temp = a;
	a = b;
	b = temp;
	System.out.println(a);
	System.out.println(b);
	
   }
}
