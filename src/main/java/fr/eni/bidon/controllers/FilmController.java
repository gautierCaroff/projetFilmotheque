package fr.eni.bidon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.eni.bidon.bll.FilmService;
import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Genre;
import fr.eni.bidon.bo.Participant;
import jakarta.annotation.PostConstruct;

@Controller
public class FilmController {
	

	
	@PostConstruct
	public void init() {
		Genre g = new Genre(1,"action");
		Participant acteur = new Participant(1, "Richard", " Attenborough");
		Participant realisateur = new Participant(2,"steven", "spielberg");
		
		Film f = new Film(1, "jurasique", 1993, 128, 
				"un résumé"
				, g,realisateur, List.of(acteur),null);
		
		filmService.saveFilm(f);
		System.err.println(filmService.getAllFilm());
	}
	
	
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping ("/film/{id:[0-9]+}")
	public String details(@PathVariable long id, Model model) {
		model.addAttribute("film", filmService.getFilmById(id));
		return "/film/details";
	}
	
	@GetMapping("/film")
	public String liste(Model model) {
		model.addAttribute("films", filmService.getAllFilm());
		return"/film/liste";
	}
	

}
