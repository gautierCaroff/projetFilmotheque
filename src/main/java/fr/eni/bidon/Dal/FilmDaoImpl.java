package fr.eni.bidon.Dal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

import fr.eni.bidon.Dal.FilmDao;
import fr.eni.bidon.bo.Film;
import org.springframework.stereotype.Component;

@Component
public class FilmDaoImpl implements FilmDao  {

	private List<Film> films;

	public FilmDaoImpl(List<Film> films) {
		this.films = new ArrayList<>();

		films.add(new Film(1, "Le Roi Lion", LocalDate.of(1994, 6, 15), 88, "L'histoire d'un jeune lion qui devient roi."));
		films.add(new Film(2, "Forrest Gump", LocalDate.of(1994, 7, 6), 142, "L'histoire d'un homme avec un QI faible et ses aventures à travers le 20ème siècle."));
		films.add(new Film(3, "Avatar", LocalDate.of(2009, 12, 18), 162, "Un ex-marine est envoyé sur une planète extraterrestre et se retrouve au cœur d'un conflit."));
	}



	@Override
	public List<Film> SelectAllFilm() {

		return films;
	}

	@Override
	public Film SelectOneFilmById(int id) {
		for(Film film : films){
			if(film.getId() == id){
				return film;
			}
		}
		return null;
	}

}
