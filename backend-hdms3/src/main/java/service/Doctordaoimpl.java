package service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.Doctor;
import repository.Doctorrepository;


@Service
public class Doctordaoimpl implements Doctordao {

    private Doctordao repository;

    @Autowired
    public void setRepository(Doctordao repository) {
        this.repository = repository;
    }

    public List<service.Doctor> getAllAd() {
        return repository.findAll();
    }

    public List<service.Doctor> findAll() {
        
        return repository.findAll();
    }

    public Doctor save(Doctor dc) {
        return repository.save(dc);
    }

    public service.Doctor getAdById(Long id) {
        
        return repository.getAdById(id);
    }

    public Doctor updateAd(Doctor dc) {
        
        return repository.save(dc);
    }

    public void deleteAd(Long id) {
       
        repository.deleteAd(id);
    }
}
