package in.codegram.employeeManagement.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import in.codegram.employeeManagement.domain.Employee;
import in.codegram.employeeManagement.service.EmployeeService;
import in.codegram.employeeManagement.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("")
	public ResponseEntity<?> createNewEmployee(@Valid @RequestBody Employee employee, BindingResult result)
	{
	
		ResponseEntity<?> errorMap= mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null)return errorMap;
		Employee savedEmployee=employeeService.saveOrUpdate(employee);
		return new	ResponseEntity<Employee>(savedEmployee, HttpStatus.CREATED);
	}
	
	@GetMapping("/{emailId}")
	public ResponseEntity<?> getEmployeeByEmail(@PathVariable String emailId)
	{
		Employee employee=employeeService.findEmployeeByEmployeeId(emailId);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	
	@GetMapping("/all")
	public Iterable<Employee> getAllEmployees()
	{
		return employeeService.findAllEmployees();
	}
	
	
	@DeleteMapping("/{emailId}")
	public ResponseEntity<?> deleteEmployee(@PathVariable String emailId)
	{
		employeeService.deletProjectByEmployeeEmail(emailId);
		return new ResponseEntity<String>("Employee with email: "+emailId.toUpperCase()+" "+"is deleted successfully!" , HttpStatus.OK) ;
	}
}
