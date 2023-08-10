package fr.eni.bidon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListeController {

    @GetMapping({"/","/liste"})
    public String afficherDetail(){

        return "liste";
    }

}
