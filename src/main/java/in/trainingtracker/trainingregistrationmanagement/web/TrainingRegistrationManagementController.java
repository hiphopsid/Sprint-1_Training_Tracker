package in.trainingtracker.trainingregistrationmanagement.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.trainingtracker.trainingregistrationmanagement.domain.TrainingRegistrationManagement;
import in.trainingtracker.trainingregistrationmanagement.service.TrainingRegistrationManagementService;
import in.trainingtracker.trainingregistrationmanagement.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/TrainingSch")
public class TrainingRegistrationManagementController {
	@Autowired
	private TrainingRegistrationManagementService TRMService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	@PostMapping("")
	public ResponseEntity<?> createNewTraining(@Valid @RequestBody TrainingRegistrationManagement TRM,BindingResult result ) {
		ResponseEntity<?> errorMap =mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		TrainingRegistrationManagement savedSchedule= TRMService.saveorupdate(TRM);
		return new ResponseEntity<TrainingRegistrationManagement>(savedSchedule,HttpStatus.CREATED);
	}
}
