package service;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controller.Admin;

@Service
public class Admindaoimpl implements Admindao {

    private final AdminRepository repository;

    @Autowired
    public Admindaoimpl(AdminRepository repository) {
        this.repository = repository;
    }

    public List<Admin> getAllAdmin() {
        return repository.findAll();
    }

    public Admin saveAdmin(Admin admin) {
        return repository.save(admin);
    }

    public Admin getAdminById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Admin updateAdmin(Admin admin) {
        return repository.save(admin);
    }

    public void deleteAdmin(Long id) {
        repository.deleteById(id);
    }
}
