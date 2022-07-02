package it.sps.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import it.sps.main.dto.FilmDtoWeb;
import it.sps.main.wrapper.WrapperList;

@Controller
public class FilmController {
	
	@Autowired
	RestTemplateBuilder rtb;
	
	@Value("${url.serverbackend}")
	private String urlBackend;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("welcome", "ciao");
		model.addAttribute("identity", "sono thymeleaf");
		return "hello";
	}
	
	
	@GetMapping("/getAllFilms")
	public String getAllFilm(Model model) {
		
		RestTemplate rt = rtb.build();
		
		// Mi prendo la risposta della chiamata effettuata tramite RestTemplate
		//ResponseEntity<List<FilmDtoWeb>> responseEntity = rt.exchange(urlBackend + "/api/v1/film/findAllFilm",HttpMethod.GET,null,new ParameterizedTypeReference<List<FilmDtoWeb>>() {});
		
		// Inserisco in una lista il risultato della getBody (ovvero il contenuto della risposta HTTP, che nel mio caso è un array di Film)
		//List<FilmDtoWeb> listaFilmDtoSlim = responseEntity.getBody();
		
		WrapperList<FilmDtoWeb> listaWrapper = rt.getForObject(urlBackend + "/api/v1/film/findAllFilm", WrapperList.class);
		//WrapperFilmDtoWeb listaWrapper = rt.getForObject(urlBackend + "/api/v1/film/findAllFilm", WrapperFilmDtoWeb.class);
		// Passo a thymelife tutta la lista di FilmDtoWeb, presente all'interno della variabile listaFilmDtoSlim
		model.addAttribute("listaFilm", listaWrapper.getList());

		return "showFilms";
		
	}
	
	
	@GetMapping(value = "/create")
	public String insertUpdate(Model model) {
		model.addAttribute("filmDtoWeb", new FilmDtoWeb());
		return "insertUpdate"; 
	}
	
	@RequestMapping(value = "/saveFilm", method = RequestMethod.POST)
	public String saveFilm(@ModelAttribute("filmDtoWeb") FilmDtoWeb filmDtoWeb, Model model) {
		RestTemplate rt = rtb.build();
		rt.postForLocation(urlBackend + "/api/v1/film/saveFilm", filmDtoWeb);
		return getAllFilm(model);
	}
	
	/*
	@RequestMapping(value = "/persistEmp", method = RequestMethod.POST)
	public String registerEmployee(@ModelAttribute("employee") EmployeeDto employee, Model model) {
		model.addAttribute("employee", employee);
	return "confirmation";
	}
	*/
}
