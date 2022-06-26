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
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("welcome", "ciao");
		model.addAttribute("identity", "sono thymeleaf");
		return "hello";
	}
	
	@GetMapping("/getAllFilms")
	public String getAllFilm(Model model) {
		List<Film> listaFilm = filmService.listaTuttiIFilm();
		model.addAttribute("listaFilm", listaFilm);
		listaFilm.get(0);
//		for (Film film : listaFilm) { 
//			model.addAttribute("titolo", film.getTitoloFilm());
//			model.addAttribute("trama", film.getTrama());
//			model.addAttribute("annoproduzione", film.getAnnoProduzione());
//			model.addAttribute("budget", film.getBudgetFilm());
//		}
		return "showFilms";
	}

}
