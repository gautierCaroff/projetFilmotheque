package fr.eni.bidon.Dal;

import java.util.List;

import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Opinion;

import org.springframework.stereotype.Service;

@Service
public interface FilmDao {
	
	public List<Film> SelectAllFilm();
	
	public Film SelectOneFilmById(int id);
	
	public Film CreateOpinion(Film film, Opinion opinion);
	
	

}
