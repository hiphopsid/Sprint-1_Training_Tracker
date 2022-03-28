package in.codegram.employeeManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codegram.employeeManagement.domain.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> 
{
	//TODO: no need to implement any CRUD operation over here, if any customization is required we can customize the CRUD method
	
	Employee findByEmailId(String emailId);
}
