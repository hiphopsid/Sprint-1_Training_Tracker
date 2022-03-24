package in.codegram.trackingmanagementapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codegram.trackingmanagementapi.domain.Project;
import in.codegram.trackingmanagementapi.service.ProjectService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@PostMapping("")
	public Project createNewProject(@RequestBody Project project) {
		Project savedProject = projectService.saveOrUpdate(project);
		return savedProject;
	}
}
