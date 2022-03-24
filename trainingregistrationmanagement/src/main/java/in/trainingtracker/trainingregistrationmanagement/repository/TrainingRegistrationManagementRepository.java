package in.trainingtracker.trainingregistrationmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.trainingtracker.trainingregistrationmanagement.domain.TrainingRegistrationManagement;
@Repository
public interface TrainingRegistrationManagementRepository extends CrudRepository<TrainingRegistrationManagement, Integer> {

}
