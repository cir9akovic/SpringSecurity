package rs.cir9akovic.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {

	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {
		return "myLoginPage";
	}
	
	@GetMapping("/accessDenied")
	public String showAccessDeniedPage() {
		return "accessDenied";
	}
	
	@GetMapping("/admin")
	public String getAdminPage() {
		return "adminPage";
	}
	
	@GetMapping("/manager")
	public String getManagerPage() {
		return "managerPage";
	}
	
	@GetMapping("/employee")
	public String getEmployeePage() {
		return "employeePage";
	}
}
