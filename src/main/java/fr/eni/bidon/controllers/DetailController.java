package fr.eni.bidon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.bidon.bll.FilmService;
import fr.eni.bidon.bo.Film;

@Controller
public class DetailController {
	
	private FilmService filmeService; 
	
	@Autowired
	public DetailController(FilmService filmeService) {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public String afficherDetail(@RequestParam int idFilm, Model modele) {
		
		// allez chercher le film
		Film film = filmeService.findById(idFilm);
		// le metre dans le model
		modele.addAttribute("film", film);
		
		return "detail";
	}

}
