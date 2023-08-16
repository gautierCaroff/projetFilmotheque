package fr.eni.bidon.controllers;

import fr.eni.bidon.bll.FilmService;
import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Opinion;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class AjouterController {

    private FilmService filmService;

    public AjouterController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/ajouter")
    public String afficherAjouter(){
        return "ajouter";
    }

    @PostMapping("/ajouter")
    public String ajouterFilm(@Valid @ModelAttribute("film") Film film,
                              BindingResult validationResult,
                              Model modele){

//        if(validationResult.hasErrors()) {
//            return "liste";
//        }

        System.out.println(film);
        System.out.println("cc");

        filmService.addFilm(film);  // Nom modifié
        return "redirect:/liste";
    }
}
