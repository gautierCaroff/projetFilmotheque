package fr.eni.bidon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bidon.bll.FilmService;
import fr.eni.bidon.bo.Film;

@Controller
@SessionAttributes({"film"})
public class DetailController {
	
	private FilmService filmeService; 
	
	@Autowired
	public DetailController(FilmService filmeService) {
		this.filmeService = filmeService;
	}
	
	@GetMapping ("/detail")
	public String afficherDetail(@RequestParam int idFilm, Model modele) {
		
		// allez chercher le film
//		Film film = filmeService.getFilmById(idFilm);
		// le metre dans le model
//		modele.addAttribute("film", film);
		
		return "detail";
	}
	
	

}
