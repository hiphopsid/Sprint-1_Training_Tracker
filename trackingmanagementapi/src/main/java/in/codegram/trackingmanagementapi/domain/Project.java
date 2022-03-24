package in.codegram.trackingmanagementapi.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ScheduleName;
	private String ScheduleIdentifier;
	private String description;
	private Date start_date;
	private Date end_date;

	private Date createdAt;
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
		return ScheduleIdentifier;
	}
	public void setScheduleIdentifier(String scheduleIdentifier) {
		ScheduleIdentifier = scheduleIdentifier;
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
