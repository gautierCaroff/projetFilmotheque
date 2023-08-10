package fr.eni.bidon.Dal;

import java.util.List;

import fr.eni.bidon.bo.Film;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface FilmDao {
	
	public List<Film> SelectAllFilm();
	
	public Film SelectOneFilmById(int id);
	
	

}
