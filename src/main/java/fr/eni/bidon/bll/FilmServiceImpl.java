package fr.eni.bidon.bll;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bidon.Dal.FilmDao;
import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Genre;
import fr.eni.bidon.bo.Participant;
import fr.eni.bidon.bo.Avis;

@Service
public class FilmServiceImpl implements FilmService {
	@Autowired
	private FilmDao filmDao;
	
	List<Film> lstFilms = new ArrayList<Film>();
	List<Genre> lstGenre = new ArrayList<Genre>();
	List<Participant> lstParticipants = new ArrayList<Participant>();

	@Override
	public List<Film> getAllFilm() {
		
		return lstFilms;
	}

	@Override
	public Film getFilmById(Long id) {
		for (Film film : lstFilms) {
			if (film.getId()==id) {
				return film;	
			}	
		}
		return null;
	}

	@Override
	public List<Genre> getGenres() {
		
		return lstGenre;
	}

	@Override
	public List<Participant> getParticipants() {
		
		return lstParticipants;
	}

	@Override
	public Genre getGenrebyId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Participant getParticipantById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveFilm(Film film) {
		lstFilms.add(film);
		
	}

	@Override
	public void AddOpinion(Film film, Avis opinion) {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
