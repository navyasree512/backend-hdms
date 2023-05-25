package service;
import java.util.List;
import com.hdms.model.Doctor;

public abstract class Doctordao {
    public abstract List<Doctor> getAllDoc();

    public abstract Doctor saveDoctor(Doctor doctor);

    public abstract Doctor getDoctorById(Long id);

    public abstract Doctor updateDoctor(Doctor doctor);

    public abstract void deleteDoctor(Long id);

	public List<service.Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public service.Doctor save(service.Doctor dc) {
		// TODO Auto-generated method stub
		return null;
	}

	public service.Doctor getAdById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAd(Long id) {
		// TODO Auto-generated method stub
		
	}

	public controller.Doctor save(controller.Doctor dc) {
		// TODO Auto-generated method stub
		return null;
	}
}

