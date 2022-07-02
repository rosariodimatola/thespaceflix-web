package it.sps.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.sps.main.dto.FilmDtoWeb;

//@Controller
public class FilmControllerOLD {
	
	//@Autowired
	//private FilmService filmService;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("welcome", "ciao");
		model.addAttribute("identity", "sono thymeleaf");
		return "hello";
	}
	
	
	@GetMapping("/getAllFilmsKO")
	public String getAllFilm(Model model) {
	//	List<Film> listaFilm = filmService.listaTuttiIFilm();
	//	model.addAttribute("listaFilm", listaFilm);
		//listaFilm.get(0);
//		for (Film film : listaFilm) { 
//			model.addAttribute("titolo", film.getTitoloFilm());
//			model.addAttribute("trama", film.getTrama());
//			model.addAttribute("annoproduzione", film.getAnnoProduzione());
//			model.addAttribute("budget", film.getBudgetFilm());
//		}
		return "showFilms";
	}

}
