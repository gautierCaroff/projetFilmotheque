package fr.eni.bidon;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.eni.bidon.bll.FilmService;
import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Genre;
import fr.eni.bidon.bo.Participant;

@SpringBootTest
class ProjetFilmothequeApplicationTests {

	@Autowired
	private FilmService filmService;
	
	
	@Test
	void testAjout() {
		Genre g = new Genre(1,"action");
		Participant acteur = new Participant(1, "Richard", " Attenborough");
		Participant realisateur = new Participant(2,"steven", "spielberg");
		
		Film f = new Film(1, "jurasique", 1993, 128, 
				"un résumé"
				, g,realisateur, List.of(acteur),null);
		
		filmService.saveFilm(f);
		System.err.println(filmService.getAllFilm());
	}
	@Test
	void contextLoads() {
	}

}
