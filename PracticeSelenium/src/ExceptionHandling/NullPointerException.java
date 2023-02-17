package ExceptionHandling;

public class NullPointerException {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String S=null;
	try {
			System.out.println(S.charAt(2));
			}
			catch(Exception e){
			System.out.println("the string value is null");
				}

	}

}
