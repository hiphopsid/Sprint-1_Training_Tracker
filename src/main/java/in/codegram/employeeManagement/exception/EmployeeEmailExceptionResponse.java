package in.codegram.employeeManagement.exception;

public class EmployeeEmailExceptionResponse {

	private String emailId;
	
	public EmployeeEmailExceptionResponse(String emailId) {
		super();
		this.emailId = emailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
