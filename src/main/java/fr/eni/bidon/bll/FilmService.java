package fr.eni.bidon.bll;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.bidon.bo.Film;

import fr.eni.bidon.bo.Genre;
import fr.eni.bidon.bo.Participant;
import fr.eni.bidon.bo.Avis;

import org.springframework.ui.Model;


@Service
public interface FilmService {
	
	
	// importer la liste de film
	public List<Film> getAllFilm();
	
	// importer un film par id
	public Film getFilmById(Long id);
	
	public List<Genre> getGenres();
	List<Participant> getParticipants();
	Genre getGenrebyId(long id);
	Participant getParticipantById(long id);
	void saveFilm(Film film);
	
	
	// ajouter un film


	// ajouter un avis

	public void AddOpinion(Film film , Avis opinion);

	public Film addFilm(Film film);


}
