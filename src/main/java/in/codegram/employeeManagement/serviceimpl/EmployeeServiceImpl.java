package in.codegram.employeeManagement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.employeeManagement.domain.Employee;
import in.codegram.employeeManagement.exception.EmployeeEmailException;
import in.codegram.employeeManagement.repository.EmployeeRepository;
import in.codegram.employeeManagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveOrUpdate(Employee employee) {
		// TODO Auto-generated method stub
		try 
		{
			return employeeRepository.save(employee);
		}
		
		catch(Exception ex)
		{
			throw new EmployeeEmailException("Employee with:"+ employee.getEmailId()+" "+"already exist");
		}
		
	}

	@Override
	public Employee findEmployeeByEmployeeId(String emailId) {
		// TODO Auto-generated method stub
		Employee employee=employeeRepository.findByEmailId(emailId);
		if(employee==null)
		{
			throw new EmployeeEmailException("Employee does not exist");
		}
		return employee;
	}

	@Override
	public Iterable<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		
		return employeeRepository.findAll();
	}

	@Override
	public void deleteProjectByEmployeeEmail(String emailId) 
	{
		
		Employee employee=employeeRepository.findByEmailId(emailId.toLowerCase());
		
		if(employee==null)
		{
			throw new EmployeeEmailException("employee doesn't exist");
		}
		
		employeeRepository.delete(employee);
		// TODO Auto-generated method stub
		
	}

}
