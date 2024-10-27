package classtopic;

public class overloading 

{
  public static void main (String [] args)
  {
	function1 (50, 20);
	function (30,20);
  }
  
  static void function1 (int a, int b)
  {
	  int c = a+b;
	  System.out.println(c);
  }
  
  static void function (int a , int b ) 
  {
	 int c = a-b;
	 System.out.println(c);
  }
}
