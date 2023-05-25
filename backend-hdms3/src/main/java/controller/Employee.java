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
import service.Employeeservice;

import java.util.List;

@Controller
public class Employee {
    @Autowired
    private EmployeeService service;

    public Employee(EmployeeService service) {
        super();
        this.service = service;
    }

    @GetMapping("/view")
    public String show(){
        return "view";
    }

    @GetMapping("/showAll")
    public String showAllEmp(Model model) {
        List<Employee> list = service.getAllEmp();
        model.addAttribute("emp", list);
        return "show";
    }

    @GetMapping("/add")
    public String addEmployee(Model model) {
        Employee emp = new Employee(service);
        model.addAttribute("emp", emp);
        return "add-emp";
    }

    @PostMapping("/save")
    public String saveEmp(@ModelAttribute("emp") Employee emp) {
        service.saveEmployee(emp);
        return "redirect:/showAll";
    }

    @GetMapping("/edit/{id}")
    public String editById(@PathVariable Long id, Model model) {
        model.addAttribute("emp", service.getEmpById(id));
        return "edit-emp";
    }

    @PostMapping("/save/{id}")
    public String saveUpdatedData(@PathVariable Long id, @ModelAttribute("emp") Employee employee, Model model) {
        Employee upemp = service.getEmpById(id);
        upemp.setEmail(employee.getEmail());
        upemp.setFirstname(employee.getFirstname());
        upemp.setLastname(employee.getLastname());
        upemp.setMobile(employee.getMobile());
        upemp.setPassword(employee.getPassword());

        service.updateEmp(upemp);
        return "redirect:/showAll";
    }

    private void setMobile(Object mobile) {
		// TODO Auto-generated method stub
		
	}

	private Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getMobile() {
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

	private Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        service.deleteEmp(id);
        return "redirect:/showAll";
    }

    public void setLastname(Object lastname) {
        // TODO Implement this method
    }

    public void setEmail(Object email) {
        // TODO Implement this method
    }

    public void setDesignation(Object designation) {
        // TODO Implement this method
    }

    public void setPassword(Object password) {
        // TODO Implement this method
    }

    public void setFirstname(Object firstname) {
        // TODO Implement this method
    }
}
