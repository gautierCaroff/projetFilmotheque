package fr.eni.bidon.bll;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.bidon.bo.Film;
import org.springframework.ui.Model;

@Service
public interface FilmService {
	
	
	// importer la liste de film
	public List<Film> findList();
	
	// importer un film par id
	public Film findById(int id);
	
	// ajouter un film
	public Film addFilm(Film film);

}
