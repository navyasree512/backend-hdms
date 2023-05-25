package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import model.Employeemodel.Emplyoee;
import repository.Employeerepository;

@Service
public class Employeedaoimpl implements Employeedao {

    private Employeerepository repository;

    @Autowired
    public Employeedaoimpl(Employeerepository repository) {
        this.repository = repository;
    }

    public List<Emplyoee> getAllEmp() {
        return repository.findAll();
    }

    public Emplyoee saveEmplyoee(Emplyoee emp) {
        return repository.save(emp);
    }

    public Optional<Emplyoee> getEmpById(Long id) {
        return repository.findById(id);
    }

    public Emplyoee updateEmp(Emplyoee emp) {
        return repository.save(emp);
    }

    public void deleteEmp(Long id) {
        repository.deleteById(id);
    }
}

