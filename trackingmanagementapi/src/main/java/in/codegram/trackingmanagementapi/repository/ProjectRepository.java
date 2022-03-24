package in.codegram.trackingmanagementapi.repository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import in.codegram.trackingmanagementapi.domain.Project;
@Repository
public interface ProjectRepository extends CrudRepository<Project,Long>{

}
