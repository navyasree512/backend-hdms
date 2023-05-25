package repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import controller.Employee;
import model.Employeemodel.Emplyoee;
@Repository

public interface Employeerepository extends Jparepository<Employee, Long>{

	void deleteById(Long id);

	Emplyoee findById(Long id);

	List<Emplyoee> findAll();

	Emplyoee save(Emplyoee emp);

}
