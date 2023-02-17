package ExceptionHandling;

public class ArithmeticException{
	public static void main(String[] args) {
		int a=4;
		int b=5;
		int c=a+b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		try {
		System.out.println(c/0);
		}
		catch(Exception e ) {
			
			System.out.println("Number can not be divided by zero");
		}
		finally {
			System.out.println("exception cleard");
		}
		
		
		
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
	}
	

}
