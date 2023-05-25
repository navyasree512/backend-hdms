package controller;

import java.util.List;

public interface DoctorService {

	List<Doctor> getAlldc();

	void saveDoctor(Doctor dc);

	Doctor getdcById(Long id);

	void updatedc(Doctor updc);

}
