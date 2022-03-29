package in.codegram.trackingmanagementapi.web;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import in.codegram.trackingmanagementapi.domain.Project;
import in.codegram.trackingmanagementapi.service.ProjectService;
import in.codegram.trackingmanagementapi.serviceimpl.MapValidatonErrorService;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private MapValidatonErrorService mapValidationErrorService;
	@PostMapping("")
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project,BindingResult result) {
		ResponseEntity<?> errorMap=mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null)return errorMap;
		Project savedProject = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(savedProject,HttpStatus.CREATED);
	}
	@GetMapping("/{scheduleId}")
	public ResponseEntity<?> getProjectById(@PathVariable String scheduleId ){
		Project project =projectService.findProjectByScheduleIdentifier(scheduleId);
		return new ResponseEntity<Project>(project,HttpStatus.OK);
		
	}
	@GetMapping("/all")
	public Iterable<Project> getAllProjects(){
		return projectService.findAllProject();
	}
	@DeleteMapping("/{scheduleId}")
	public ResponseEntity<?> deleteProject(@PathVariable String scheduleId){
		projectService.deleteProjectByScheduleIdentifier(scheduleId);
		return new ResponseEntity<String>("Schedule with ID : "+scheduleId.toUpperCase()+"Deleted Successfully",HttpStatus.OK);
		
	}
}
