package in.codegram.employeeManagement.service;

import in.codegram.employeeManagement.domain.Employee;

public interface EmployeeService 
{
	public Employee saveOrUpdate(Employee employee);
	public Employee findEmployeeByEmployeeId(String emailId);
	public Iterable<Employee> findAllEmployees();
	public void deletProjectByEmployeeEmail(String emailId);
}
