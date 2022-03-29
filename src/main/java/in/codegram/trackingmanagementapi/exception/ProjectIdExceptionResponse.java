package in.codegram.trackingmanagementapi.exception;

public class ProjectIdExceptionResponse {
private String scheduleIdentifier;

public ProjectIdExceptionResponse(String scheduleIdentifier) {
	super();
	this.scheduleIdentifier = scheduleIdentifier;
}

public String getScheduleIdentifier() {
	return scheduleIdentifier;
}

public void setScheduleIdentifier(String scheduleIdentifier) {
	this.scheduleIdentifier = scheduleIdentifier;
}

}
