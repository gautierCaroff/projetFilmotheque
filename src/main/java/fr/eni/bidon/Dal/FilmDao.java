package fr.eni.bidon.Dal;

import java.time.LocalDate;
import java.util.List;

import fr.eni.bidon.bo.Film;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public interface FilmDao {
	
	public List<Film> SelectAllFilm();
	
	public Film SelectOneFilmById(int id);

	public void addFilm(Film film);
	
	

}
