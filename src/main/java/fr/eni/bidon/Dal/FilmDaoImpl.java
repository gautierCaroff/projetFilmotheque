package fr.eni.bidon.Dal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

import fr.eni.bidon.Dal.FilmDao;
import fr.eni.bidon.bo.Film;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

@Component
public class FilmDaoImpl implements FilmDao  {

	private List<Film> films;

	public FilmDaoImpl(List<Film> films) {
		this.films = new ArrayList<>();

		this.films.add(new Film(1, "Le Roi Lion", LocalDate.of(1994, 6, 15), 88, "L'histoire d'un jeune lion qui devient roi."));
		this.films.add(new Film(2, "Forrest Gump", LocalDate.of(1994, 7, 6), 142, "L'histoire d'un homme avec un QI faible et ses aventures à travers le 20ème siècle."));
		this.films.add(new Film(3, "Avatar", LocalDate.of(2009, 12, 18), 162, "Un ex-marine est envoyé sur une planète extraterrestre et se retrouve au cœur d'un conflit."));
	}



	@Override
	public List<Film> SelectAllFilm() {
		
		System.err.println(films);
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

	@Override
	public void addFilm(Film film) {
		int id = films.stream()
				.mapToInt(Film::getId)
				.max()
				.orElse(-1);

		this.films.add(new Film(id +1, film.getTitre(), film.getDate(), film.getDuree(), film.getSynopsy()));
	}

}
