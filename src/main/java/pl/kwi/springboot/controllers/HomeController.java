package pl.kwi.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.kwi.springboot.commands.HomeCommand;
import pl.kwi.springboot.db.repositories.ArticleRepository;
import pl.kwi.springboot.db.repositories.DanceTypeRepository;

@Controller
@RequestMapping(value="/home")
public class HomeController {

	@Autowired
	private DanceTypeRepository danceTypeRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	@RequestMapping
	public String displayPage(@ModelAttribute("command") HomeCommand command) {
		
		command.setDanceTypes(danceTypeRepository.findAll());
				
		if (command.getSelectedDanceTypes().isEmpty()) {
			command.setArticles(articleRepository.findAll());			
		} else {
			command.setArticles(articleRepository.findByDanceTypeIds(command.getSelectedDanceTypes()));
		}		
		
		return "home";
	}

}