package in.trainingtracker.trainingregistrationmanagement.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class TrainingRegistrationManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank(message="User name is reqired")
	private String trainer_name;
	@NotBlank(message="Unique id is reqired")
	private String unique_id;
	@NotBlank(message="Training name is reqired")
	@Column(updatable= false, unique =true)
	private String training_name;
	@NotBlank(message="Field is reqired")
	private String nominated_or_alloted;
	@JsonFormat(pattern="yyy-MM-dd")
	private Date created_at;
	

	public TrainingRegistrationManagement(){
		super();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getTrainer_name() {
		return trainer_name;
	}

	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}

	public String getUnique_id() {
		return unique_id;
	}

	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}

	public String getTraining_name() {
		return training_name;
	}

	public void setTraining_name(String training_name) {
		this.training_name = training_name;
	}
	public String getNominated_or_alloted() {
		return nominated_or_alloted;
	}

	public void setNominated_or_alloted(String nominated_or_alloted) {
		this.nominated_or_alloted = nominated_or_alloted;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	@PrePersist
	public void onCreate() {
		this.created_at=new Date();
	
	} 

}
