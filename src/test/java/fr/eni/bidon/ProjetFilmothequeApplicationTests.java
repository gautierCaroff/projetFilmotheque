package fr.eni.bidon;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.eni.bidon.bll.FilmService;
import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Genre;
import fr.eni.bidon.bo.Participant;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class ProjetFilmothequeApplicationTests {

	@Autowired
	private FilmService filmService;

	@Autowired
	private EntityManager em;


//	@Test
//	void testAjout() {
//		Genre g = new Genre(1,"action");
//		Participant acteur = new Participant(1, "Richard", "Attenborough");
//		Participant realisateur = new Participant(2,"steven", "spielberg");
//
//		Film f = new Film(1, "jurasique", 1993, 128,
//				"un résumé"
//				, g,realisateur, List.of(acteur),null);
//
//		filmService.saveFilm(f);
//		System.err.println(filmService.getAllFilm());
//	}

	@Test
	@Transactional
	@Rollback(false)
	void ajoutFilm(){
		Participant acteur1 = new Participant();
		acteur1.setNom("Attenborough");
		acteur1.setPrenom("Richard");
		em.persist(acteur1);

		Participant realisateur1 = new Participant();
		realisateur1.setNom("Spielberg");
		realisateur1.setPrenom("Steven");
		em.persist(realisateur1);


		Genre genreAction = new Genre();
		genreAction.setLibelle("Action");
		em.persist(genreAction);

		Film film1 = new Film();
		film1.setTitre("jurasique");
		film1.setAnnee(1993);
		film1.setDuree(128);
		film1.setSynopsy("un résumé");
//		film1.setActeurs((List<Participant>) acteur1);
		film1.setRealisateur(realisateur1);
		film1.setGenre(genreAction);

		em.persist(film1);
	}

	@Test
	void contextLoads() {
	}

}
