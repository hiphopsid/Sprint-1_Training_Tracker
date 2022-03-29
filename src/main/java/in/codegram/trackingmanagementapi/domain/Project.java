package in.codegram.trackingmanagementapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message="ScheduleName is required ")
	private String ScheduleName;
	@NotBlank(message="ScheduleIdentifier is required")
	@Size(min=4,max=5,message="Please use 4-5 character only")
	@Column(updatable =false,unique =true)
	private String scheduleIdentifier;
	@NotBlank(message="description is required")
	private String description;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date start_date;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date end_date;
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	public Project() {
		super();
	
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getScheduleName() {
		return ScheduleName;
	}
	public void setScheduleName(String scheduleName) {
		ScheduleName = scheduleName;
	}
	


	public String getScheduleIdentifier() {
		return scheduleIdentifier;
	}
	public void setScheduleIdentifier(String scheduleIdentifier) {
		this.scheduleIdentifier = scheduleIdentifier;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
@PrePersist
	public void onCreate(){
		this.createdAt=new Date();
	}
@PreUpdate
	public void onUpdate() {
		this.updatedAt=new Date();
	}
}
