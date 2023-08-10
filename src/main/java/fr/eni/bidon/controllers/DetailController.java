package fr.eni.bidon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.bidon.bll.FilmService;

@Controller
public class DetailController {
	
	private FilmService filmeService; 
	
	@Autowired
	public DetailController(FilmService filmeService) {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public String afficherDetail(@RequestParam int idFilm) {
		
		 
		
		
		
		// allez chercher le film
		
		
		
		// le metre dans le model
		
		
		
		return "detail";
	}

}
