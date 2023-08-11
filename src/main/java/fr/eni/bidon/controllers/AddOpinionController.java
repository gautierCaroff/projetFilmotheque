package fr.eni.bidon.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.bidon.bll.FilmService;
import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Opinion;
import jakarta.validation.Valid;


@Controller
@SessionAttributes({"film"})
public class AddOpinionController {

private FilmService filmService;
	
	@Autowired
	public AddOpinionController(FilmService filmService) {
		this.filmService = filmService;
	}

    @GetMapping("/ajouterAvis")
    public String afficherAjouterOpinion(Model modele){
    	
    	Film film = (Film) modele.getAttribute("film");
		if (film == null) {
			return "liste";
				
		}   
		modele.addAttribute("opinion", new Opinion(0, 0, null));
		
        return "addOpinion";
    }
    
    @PostMapping("/ajouterAvis")
    public String validerAjouterOpinion(
    		@Valid @ModelAttribute("opinion") Opinion opinion,
    		BindingResult validationResult,
    		Model modele){
    	
    	if(validationResult.hasErrors()) {
			return "liste";
		}
    	
    	
    	Film film = (Film) modele.getAttribute("film");
		if (film == null) {
			return "liste";
					
		}  
		this.filmService.AddOpinion(film, opinion);
		System.err.println("opinion ajoutée");
		System.out.println(film);

		modele.addAttribute("film", film);
		
		return "detail";
    }
    
}
