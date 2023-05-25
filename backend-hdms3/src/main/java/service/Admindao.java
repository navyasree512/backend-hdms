package service;
import java.util.List;

import controller.Admin;
import controller.Admin;

public interface Admindao {
    List<Admin> getAllAdmin();

    Admin saveAdmin(Admin admin);

    Admin getAdminById(Long id);

    Admin updateAdmin(Admin admin);

    void deleteAdmin(Long id);
}


