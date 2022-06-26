package it.sps.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.sps.main.entities.Film;
import it.sps.main.services.FilmService;
import it.sps.main.services.FilmServiceImpl;

@Controller
public class GeneralController {
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/index")
	public String getAllFilm(Model model) {
		return "index";
	}

}
