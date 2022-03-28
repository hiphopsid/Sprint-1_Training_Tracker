package in.codegram.employeeManagement.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Employee Name is required")
	private String name;
	
	@NotBlank(message="Employee email  is required")
	@Column(updatable=false, unique=true)
	private String emailId;
	
	
	 @Min(value=10, message="must be a 10 digit number")  
//	 @Max(value=10, message="must be a 10 digit number") 
	private Long phoneNumber;
	
	private Date start_date;
	private Date end_date;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date created_At;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updated_At;
	
	public Employee() {
		super();
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getStart_date() {
		return start_date;
	}
	
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	
	public Date getEnd_date() {
		return end_date;
	}
	
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	
	@PrePersist
	public void on_Create()
	{
		this.created_At=new Date();
	}
	
	@PreUpdate
	public void on_Update()
	{
		this.updated_At=new Date();
	}
	
	
}
