package fr.eni.bidon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.bidon.bll.FilmService;
import fr.eni.bidon.bo.Film;

@Controller
public class ListeController {
	
	private FilmService filmService;
	
	@Autowired
	public ListeController(FilmService filmService) {
		this.filmService = filmService;
	}

    @GetMapping({"/","/liste"})
    public String afficherDetail(Model modele){
    	List<Film> films = filmService.findList();
    	modele.addAttribute("films",films);
    	

        return "liste";
    }

}
