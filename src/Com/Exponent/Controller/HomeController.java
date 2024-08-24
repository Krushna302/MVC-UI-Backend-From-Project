package Com.Exponent.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Com.Exponent.Model.Employee;

@Controller
public class HomeController {
	
	
	
	List<Employee> listemp = new ArrayList<Employee>();
	
	@RequestMapping(value="/log")
	public String getEmployeeDetails(@RequestParam("eusername") String un,@RequestParam("epassword") String ps ,Model m) {
		
		for (Employee emp : listemp) {
			
			if(un.equals(emp.getEusername())&& ps.equals(emp.getEpassword())) {
				
				
				return"success";
				
			}
			else {
				
				m.addAttribute("msg", "Invalid UserName And PassWord");
				
			}
			
		}
		
				
	return "login";
		
	}
	
	
	
	
	
	@RequestMapping(value="/reg")
	public String getEmployeeDetails(@ModelAttribute Employee emp ,Model m) {
		
		
		System.out.println(emp);
		
		m.addAttribute("msg", emp);
		
		listemp.add(emp);
		
		return "login";
		
	}
	
	

}
