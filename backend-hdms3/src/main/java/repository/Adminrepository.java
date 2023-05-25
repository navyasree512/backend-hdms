package repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import controller.Admin;


@Repository

public interface Adminrepository extends Jparepository<Admin,Long> {

	void deleteById(Long id);

	Object findById(Long id);

	List<Admin> findAll();

	Admin save(Admin ad);

}
