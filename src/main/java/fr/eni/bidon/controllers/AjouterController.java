package fr.eni.bidon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Controller
public class AjouterController {

    @GetMapping("/ajouter")
    public String afficherAjouter(){
        return "ajouter";
    }

    @PostMapping("/ajouter")
    public String ajouterFilm(String titre, LocalDate date, int duree, String synopsy, Model modele){
        return "liste";
    }
}
