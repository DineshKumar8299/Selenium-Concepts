package ExceptionHandling;

public class Company {
	private void search() {
		String id="23456";
		if(id.startsWith("24")) {
			System.out.println("Employee is present in the Unit");
		}else {
			try {
				throw new EmployeeNotFoundException();
			}
			catch(EmployeeNotFoundException e) {
				e.printStackTrace();
				
			}
			finally {
				System.out.println("Exception Handled");
			}
			
		}
		
	}
 public static void main(String[] args) {
	Company c=new Company();
	c.search();
	
}
}
