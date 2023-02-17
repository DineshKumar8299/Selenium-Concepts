package ExceptionHandling;


@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception{
	
	public String getmessage() {
		String Msg="Employee Not found in unit 1";
		
		//System.out.println(Msg);
		return Msg;
	}
	

}
