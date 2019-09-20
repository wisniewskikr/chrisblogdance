package pl.kwi.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.kwi.springboot.commands.ArticleCommand;
import pl.kwi.springboot.db.repositories.ArticleRepository;

@Controller
@RequestMapping(value="/home/article")
public class ArticleController {

	@Autowired
	private ArticleRepository articleRepository;
	
	@RequestMapping(value="/{articleId}")
	public String displayPage(@PathVariable(name="articleId") long articleId, 
							  @ModelAttribute("command") ArticleCommand command) {
		
//		command.setArticle(articleRepository.findOne(articleId));				
		return "article";
	}

}