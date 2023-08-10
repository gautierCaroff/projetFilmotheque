package fr.eni.bidon.Dal;

import java.util.List;

import fr.eni.bidon.bo.Film;

public interface FilmDao {
	
	public List<Film> SelectAllFilm();
	
	public Film SelectOneFilmById(int id);
	
	

}
