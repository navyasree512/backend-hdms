package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hdms.service.HDMSservice;
@Controller
public class Admin<service> {
    @Autowired
    private AdminService service;

    public Admin(AdminService service) {
        super();
        this.service = service;
    }

    @GetMapping("/view")
    public String show() {
        return "view";
    }

    @GetMapping("/showAll")
    public String showAllAd(Model model) {
        List<Admin> list = service.getAllAd();
        model.addAttribute("Ad", list);
        return "show";
    }

    @GetMapping("/add")
    public String addAdmin(Model model) {
        Admin Ad = newAdmin();
        model.addAttribute("ad", Ad);
        return "add-ad";
    }

    private Admin newAdmin() {
        // TODO Auto-generated method stub
        return null;
    }

    @PostMapping("/save")
    public String saveAd(@ModelAttribute("ad") Admin Ad) {
        service.saveAdmin(Ad);
        return "redirect:/showAll";
    }

    @GetMapping("/edit/{id}")
    public String editById(@PathVariable Long id, Model model) {
        model.addAttribute("ad", HDMSservice.getAdById(id));
        return "edit-ad";
    }

    @PostMapping("/save/{id}")
    public <service> String saveUpdatedData(@PathVariable Long id, @ModelAttribute("ad") Admin admin, Model model) {
        Admin upAd = service.getAdById(id);
        upAd.setEmail(admin.getEmail());
        upAd.setFirstname(admin.getFirstname());
        upAd.setLastname(admin.getLastname());
        upAd.setMobile(admin.getMobile());
        upAd.setPassword(admin.getPassword());

        service.updateAd(upAd);
        return "redirect:/showAll";
    }

    private void setEmail(Object email) {
		// TODO Auto-generated method stub
		
	}

	private void setLastname(Object lastname) {
		// TODO Auto-generated method stub
		
	}

	private void setFirstname(Object firstname) {
		// TODO Auto-generated method stub
		
	}

	private Object getLastname() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getFirstname() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setMobile(Object mobile) {
		// TODO Auto-generated method stub
		
	}

	private Object getMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setPassword(Object password) {
		// TODO Auto-generated method stub
		
	}

	private Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id) {
        service.deleteAd(id);
        return "redirect:/showAll";
    }
}


