package fr.eni.bidon.Dal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

import fr.eni.bidon.Dal.FilmDao;
import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Avis;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class FilmDaoImpl implements FilmDao  {

	private List<Film> films;

	public FilmDaoImpl(List<Film> films) {
		this.films = new ArrayList<>();

		
		Film film = new Film(1, "Le Roi Lion",1994, 88, "L'histoire d'un jeune lion qui devient roi.");
//		Avis opinion = new Avis(1, 5, "bien");
//		film.addOpinion(opinion);
//		Avis opinion2 = new Avis(1, 2, "pas bien");
//		film.addOpinion(opinion2);
		this.films.add(film);

		this.films.add(new Film(1, "Le Roi Lion", 1994, 88, "L'histoire d'un jeune lion qui devient roi."));
		
		
		
		this.films.add(new Film(2, "Forrest Gump", 1994, 142, "L'histoire d'un homme avec un QI faible et ses aventures à travers le 20ème siècle."));
		this.films.add(new Film(3, "Avatar", 2009, 162, "Un ex-marine est envoyé sur une planète extraterrestre et se retrouve au cœur d'un conflit."));

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
	public Film CreateOpinion(Film film, Avis opinion) {
		film.addOpinion(opinion);
		return film;
	}

	@Override
	public void addFilm(Film film) {
		int id = films.stream()
				.mapToInt(Film::getId)
				.max()
				.orElse(-1);

		this.films.add(new Film(id +1, film.getTitre(), film.getAnnee(), film.getDuree(), film.getSynopsy()));
	}

}
