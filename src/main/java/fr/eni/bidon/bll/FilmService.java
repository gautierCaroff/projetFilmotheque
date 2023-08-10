package fr.eni.bidon.bll;

import java.util.List;

import fr.eni.bidon.bo.Film;
import org.springframework.stereotype.Service;

@Service
public interface FilmService {
	
	
	// importer la liste de film
	public List<Film> findList();
	
	// importer un film par id
	public Film findById(int id);
	
	// ajouter un film
	

}
