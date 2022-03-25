package in.codegram.employeeManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeEmailException extends RuntimeException 
{

	public EmployeeEmailException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEmailException(String errMsg) {
		super(errMsg);
		// TODO Auto-generated constructor stub
	}
	
}
