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
		
		List<Integer> pages = new ArrayList<Integer>();
		int first = getFirst(command.getCurrentPage(), page.getTotalPages());
		int last = getLast(command.getCurrentPage(), page.getTotalPages());
		for (int i = first; i <= last; i++) {
			pages.add(i);
		}
		command.setPages(pages);
		
		if (command.getCurrentPage() == 1) {
			command.setDisablePrevious(true);
		} else {
			command.setDisablePrevious(false);
		}
		
		if (command.getCurrentPage() == page.getTotalPages()) {
			command.setDisableNext(true);
		} else {
			command.setDisableNext(false);
		}
		
	}
	
	private int getFirst(int currentPage, int totalPages) {
		
		int result = 1;
		
		if (totalPages <= 5) {
			return result;
		}
		
		if ((currentPage - 1 ) > 0) {
			result = currentPage - 1;
		}
		
		if ((currentPage - 2) > 0) {
			result = currentPage - 2;
		}
		
		if ((currentPage - 3) > 0 && (currentPage + 2) > totalPages) {
			result = currentPage - 3;
		}
		
		if ((currentPage - 4) > 0 && (currentPage + 1) > totalPages) {
			result = currentPage - 4;
		}
		
		return result;
		
	}
	
	private int getLast(int currentPage, int totalPages) {
		
		int result = totalPages;
		
		if (totalPages <= 5) {
			return result;
		}
		
		if ((currentPage + 1) <= totalPages) {
			result = currentPage + 1;
		}
		
		if ((currentPage + 2) <= totalPages) {
			result = currentPage + 2;
		}
		
		if ((currentPage + 3 ) < totalPages  && (currentPage - 2) <= 0) {
			result = currentPage + 3;
		}
		
		if ((currentPage + 4) < totalPages  && (currentPage - 1) <= 0) {
			result = currentPage + 4;
		}
		
		
		
		return result;
		
	}

}