package it.sps.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {
	
	@GetMapping("/index")
	public String getAllFilm(Model model) {
		return "index";
	}

}
