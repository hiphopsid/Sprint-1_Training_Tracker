package in.codegram.trackingmanagementapi.service;

import org.springframework.stereotype.Service;

import in.codegram.trackingmanagementapi.domain.Project;

public interface ProjectService {
	public Project saveOrUpdate(Project project);
	//public Project findProjectByScheduleIdentifier(String scheduleId);
	public Iterable<Project>  findAllProject();
	//public void deleteProjectByScheduleIdentifier(String scheduleId);
	public Project findProjectByScheduleIdentifier(String scheduleId);
	public void deleteProjectByScheduleIdentifier(String scheduleId);
	
}
