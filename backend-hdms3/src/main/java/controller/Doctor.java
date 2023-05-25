package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import model.Employeemodel.Emplyoee;


@Controller
public class Doctor {
    @Autowired
    private DoctorService service;

    public Doctor(DoctorService service) {
        super();
        this.service = service;
    }

    @GetMapping("/view")
    public String show() {
        return "view";
    }

    @GetMapping("/showAll")
    public String showAlldc(Model model) {
        List<Doctor> list = service.getAlldc();
        model.addAttribute("dc", list);
        return "show";
    }

    @GetMapping("/add")
    public String addDoctor(Model model) {
        Doctor dc = new Doctor(service);
        model.addAttribute("dc", dc);
        return "add-dc";
    }

    @PostMapping("/save")
    public String savedc(@ModelAttribute("dc") Doctor dc) {
        service.saveDoctor(dc);
        return "redirect:/showAll";
    }

    @GetMapping("/edit/{id}")
    public String editById(@PathVariable Long id, Model model) {
        model.addAttribute("dc", service.getdcById(id));
        return "edit-dc";
    }

    @PostMapping("/save/{id}")
    public String saveUpdatedData(@PathVariable Long id, @ModelAttribute("dc") Doctor doctor, Model model) {
        Doctor updc = service.getdcById(id);
        updc.setEmail(doctor.getEmail());
        updc.setFirstname(doctor.getFirstname());
        updc.setLastname(doctor.getLastname());
        updc.setDesignation(doctor.getDesignation());
        updc.setPassword(doctor.getPassword());

        service.updatedc(updc);
        return "redirect:/showAll";
    }

	private void setFirstname(Object firstname) {
		// TODO Auto-generated method stub
		
	}

	private void setLastname(Object lastname) {
		// TODO Auto-generated method stub
		
	}

	private void setPassword(Object password) {
		// TODO Auto-generated method stub
		
	}

	private void setDesignation(Object designation) {
		// TODO Auto-generated method stub
		
	}

	private Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getDesignation() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getLastname() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getFirstname() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setEmail(Object email) {
		// TODO Auto-generated method stub
		
	}

	private Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}




