package pl.kwi.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.kwi.springboot.db.repositories.DanceTypeRepository;

@Controller
@RequestMapping(value="/home")
public class HomeController {

	@Autowired
	private DanceTypeRepository danceTypeRepository;
	
	@ModelAttribute
	public void addAttributes(Model model) {
	    model.addAttribute("danceTypes", danceTypeRepository.findAll());
	}
	
	@RequestMapping
	public String displayPage() {		
		return "home";
	}

}