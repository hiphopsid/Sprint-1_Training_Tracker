package in.trainingtracker.trainingregistrationmanagement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.trainingtracker.trainingregistrationmanagement.domain.TrainingRegistrationManagement;
import in.trainingtracker.trainingregistrationmanagement.repository.TrainingRegistrationManagementRepository;
import in.trainingtracker.trainingregistrationmanagement.service.TrainingRegistrationManagementService;
@Service
public class TrainingRegistrationManagementServiceImpl implements TrainingRegistrationManagementService {
	@Autowired
	private TrainingRegistrationManagementRepository TRMRepository;

	@Override
	public TrainingRegistrationManagement saveorupdate(TrainingRegistrationManagement TRMService) {
		// TODO Auto-generated method stub
		return TRMRepository.save(TRMService);
	}

	

	
	
}
