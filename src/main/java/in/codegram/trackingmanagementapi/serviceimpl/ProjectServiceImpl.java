package in.codegram.trackingmanagementapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.codegram.trackingmanagementapi.domain.Project;
import in.codegram.trackingmanagementapi.exception.ProjectIdException;
import in.codegram.trackingmanagementapi.repository.ProjectRepository;
import in.codegram.trackingmanagementapi.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public Project saveOrUpdate(Project project) {
		// TODO Auto-generated method stub
		try {
			
		project.setScheduleIdentifier(project.getScheduleIdentifier().toUpperCase());
		return projectRepository.save(project);
	}catch(Exception ex) {
		throw new ProjectIdException("Schedule Id : "+project.getScheduleIdentifier().toUpperCase()+"already exist");
	}
	}
	/*@Override
	public Project findProjectByScheduleIdentifier(String scheduleId) {
		Project project=projectRepository.findByScheduleIdentifier(scheduleId);
		if(project==null) {
			throw new ProjectIdException("Schedule Identifier :"+project.getScheduleIdentifier().toUpperCase()+"does not exist");
		}
		return project;
	}*/
	
	@Override
	public Iterable<Project> findAllProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}
/*	@Override
	public void deleteProjectByScheduleIdentifier(String scheduleId) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public Project findProjectByScheduleIdentifier(String scheduleId) {
		// TODO Auto-generated method stub
		Project project=projectRepository.findByScheduleIdentifier(scheduleId);
		if(project==null) {
			throw new ProjectIdException("Schedule Identifier :"+project.getScheduleIdentifier().toUpperCase()+"does not exist");
		}
		return project;
	}

	@Override
	public void deleteProjectByScheduleIdentifier(String scheduleId) {
		Project project=projectRepository.findByScheduleIdentifier(scheduleId);
		if(project==null) {
			throw new ProjectIdException("Schedule Identifier :"+project.getScheduleIdentifier().toUpperCase()+"does not exist");
		}
		projectRepository.delete(project);
		
	}


	}
