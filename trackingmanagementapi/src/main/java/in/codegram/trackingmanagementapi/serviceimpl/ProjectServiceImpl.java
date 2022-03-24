package in.codegram.trackingmanagementapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import in.codegram.trackingmanagementapi.domain.Project;
import in.codegram.trackingmanagementapi.repository.ProjectRepository;
import in.codegram.trackingmanagementapi.service.ProjectService;
@Component
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;
	@Override
	public Project saveOrUpdate(Project project) {
		// TODO Auto-generated method stub
		return projectRepository.save(project);
	}

}
