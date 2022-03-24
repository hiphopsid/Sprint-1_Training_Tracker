package in.trainingtracker.trainingregistrationmanagement.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrainingRegistrationManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nominated_trainers;
	private String Alloted_trainer;
	private String Batch_name;
	private Date start_date;
	private Date end_date;
	public TrainingRegistrationManagement(){
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNominated_trainers() {
		return nominated_trainers;
	}
	public void setNominated_trainers(String nominated_trainers) {
		this.nominated_trainers = nominated_trainers;
	}
	public String getAlloted_trainer() {
		return Alloted_trainer;
	}
	public void setAlloted_trainer(String alloted_trainer) {
		Alloted_trainer = alloted_trainer;
	}
	public String getBatch_name() {
		return Batch_name;
	}
	public void setBatch_name(String batch_name) {
		Batch_name = batch_name;
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
	
	
	  


}

