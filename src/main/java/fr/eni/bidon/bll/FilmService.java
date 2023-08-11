package fr.eni.bidon.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Opinion;
@Service
public interface FilmService {
	
	
	// importer la liste de film
	public List<Film> findList();
	
	// importer un film par id
	public Film findById(int id);
	
	// ajouter un film
	
	
	// ajouter un avis
	public void AddOpinion(Film film , Opinion opinion);

}
