package in.codegram.employeeManagement.exception;

public class EmployeeEmailExceptionResponse {

	private String email_id;
	
	public EmployeeEmailExceptionResponse(String email_id) {
		super();
		this.email_id = email_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	
}
