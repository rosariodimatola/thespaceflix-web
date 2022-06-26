/*
 package it.sps.main.demo.web;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.example.demo.models.EmployeeDto;

	@Controller
	public class OrdineController {
		
		@GetMapping("/getMessage")
		public String message(Model model) {
			model.addAttribute("user", "spsuser");
			model.addAttribute("message", "Sent from controller");
			return "message";
		}
		
		@GetMapping("/start")
		public String start(Model model) {
			return "index";
		}
	
		@GetMapping("/createEmp")
			public String home(Model model) {
			//model.addAttribute("employee", new EmployeeDto());
			return "register";
		}
	
		@RequestMapping(value = "/persistEmp", method = RequestMethod.POST)
			public String registerEmployee(@ModelAttribute("employee") EmployeeDto employee, Model model) {
			model.addAttribute("employee", employee);
			return "confirmation";
		}
	
	
		@GetMapping("/allEmp")
			public String showAll(Model model) {
			model.addAttribute("employees", List.of(new EmployeeDto(), new EmployeeDto(), new EmployeeDto()));
			return "employees";
		}
}
*/