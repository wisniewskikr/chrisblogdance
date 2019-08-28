package pl.kwi.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.kwi.springboot.db.entities.DanceTypeEntity;
import pl.kwi.springboot.db.repositories.DanceTypeRepository;

@Controller
@RequestMapping(value="/home")
public class HomeController {

	@Autowired
	private DanceTypeRepository danceTypeRepository;	
	
	@RequestMapping
	public String displayPage() {
		
		Iterable<DanceTypeEntity> danceTypes = danceTypeRepository.findAll();
		for (DanceTypeEntity danceTypeEntity : danceTypes) {
			System.out.println(danceTypeEntity.getName());
		}
		
		return "home";
	}

}