package repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import controller.Doctor;
@Repository

public interface Doctorrepository  extends Jparepository<Doctor,Long>{

	List<service.Doctor> findAll();

}
