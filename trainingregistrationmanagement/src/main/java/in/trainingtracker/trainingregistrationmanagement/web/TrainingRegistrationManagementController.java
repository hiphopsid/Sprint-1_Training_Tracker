package in.trainingtracker.trainingregistrationmanagement.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.trainingtracker.trainingregistrationmanagement.domain.TrainingRegistrationManagement;
import in.trainingtracker.trainingregistrationmanagement.service.TrainingRegistrationManagementService;

@RestController
@RequestMapping("/api/Training")
public class TrainingRegistrationManagementController {
	@Autowired
	private TrainingRegistrationManagementService TRMService;
	@PostMapping("")
	public TrainingRegistrationManagement createNewTraining(@RequestBody TrainingRegistrationManagement TRM ) {
		TrainingRegistrationManagement savedSchedule= TRMService.saveorupdate(TRM);
		return savedSchedule;
	}
}
