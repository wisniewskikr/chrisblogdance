package pl.kwi.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.kwi.springboot.commands.HomeCommand;
import pl.kwi.springboot.db.entities.ArticleEntity;
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
	public String displayPage(
			@ModelAttribute("command") HomeCommand command) {
		
		command.setDanceTypes(danceTypeRepository.findAll());
				
		if (command.getSelectedDanceTypes().isEmpty()) {
			Pageable pageable = PageRequest.of(command.getCurrentPage() - 1, 2);	
			Page<ArticleEntity> page = articleRepository.findAllAsPage(pageable);
			command.setArticles(page.getContent());
			handlePagination(command, page);
		} else {
			command.setArticles(articleRepository.findByDanceTypeIds(command.getSelectedDanceTypes()));
		}			
		
		return "home";
	}
	
	private void handlePagination(HomeCommand command, Page<ArticleEntity> page) {
		
		List<String> pages = new ArrayList<String>();
		for (int i = 1; i < page.getTotalPages(); i++) {
			pages.add(String.valueOf(i));
		}
		command.setPages(pages);
		
		if (command.getCurrentPage() == 1) {
			command.setDisplayPrevious(false);
		} else {
			command.setDisplayPrevious(true);
		}
		
		if (command.getCurrentPage() == page.getTotalPages()) {
			command.setDisplayNext(false);
		} else {
			command.setDisplayNext(true);
		}
		
	}

}