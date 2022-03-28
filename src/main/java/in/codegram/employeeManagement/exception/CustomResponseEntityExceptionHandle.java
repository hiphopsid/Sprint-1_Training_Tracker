package in.codegram.employeeManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandle extends ResponseEntityExceptionHandler
{
	@ExceptionHandler
	public final ResponseEntity<Object> handleEmployeeEmailException(EmployeeEmailException ex, WebRequest webRequest)
	{
		EmployeeEmailExceptionResponse exceptionResponse=new EmployeeEmailExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
