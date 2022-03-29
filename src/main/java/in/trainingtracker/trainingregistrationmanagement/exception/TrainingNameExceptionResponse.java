package in.trainingtracker.trainingregistrationmanagement.exception;

public class TrainingNameExceptionResponse {
	private String trainingName;

	public TrainingNameExceptionResponse(String trainingName) {
		super();
		this.trainingName = trainingName;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
}
