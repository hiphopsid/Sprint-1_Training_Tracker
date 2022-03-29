package in.trainingtracker.trainingregistrationmanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestController
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler
	public final ResponseEntity<Object> handleTrainingNameException(TrainingNameException ex, WebRequest request){
		TrainingNameExceptionResponse trainingNameExceptionResponse =new TrainingNameExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(trainingNameExceptionResponse,HttpStatus.BAD_REQUEST);
	}
}
