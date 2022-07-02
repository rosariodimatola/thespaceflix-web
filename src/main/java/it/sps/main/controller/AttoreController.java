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
import it.sps.main.dto.AttoreDtoWeb;
import it.sps.main.wrapper.WrapperList;

@Controller
public class AttoreController {
	
	@Autowired
	RestTemplateBuilder rtb;
	
	@Value("${url.serverbackend}")
	private String urlBackend;
	
	
	@GetMapping("/getAllActors")
	public String getAllActors(Model model) {
		
		RestTemplate rt = rtb.build();
		
		WrapperList<AttoreDtoWeb> listaWrapper = rt.getForObject(urlBackend + "/api/v1/actors/findAllActors", WrapperList.class);
		model.addAttribute("listaAttori", listaWrapper.getList());

		return "showActors";
		
	}
	
	
	@GetMapping(value = "/createActor")
	public String insertUpdate(Model model) {
		model.addAttribute("attoreDtoWeb", new AttoreDtoWeb());
		return "insertActor"; 
	}
	
	@RequestMapping(value = "/saveActor", method = RequestMethod.POST)
	public String saveActor(@ModelAttribute("attoreDtoWeb") AttoreDtoWeb attoreDtoWeb, Model model) {
		RestTemplate rt = rtb.build();
		rt.postForLocation(urlBackend + "/api/v1/actors/saveActor", attoreDtoWeb);
		return getAllActors(model);
	}
	
}
