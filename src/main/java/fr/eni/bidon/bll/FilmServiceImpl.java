package fr.eni.bidon.bll;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bidon.Dal.FilmDao;
import fr.eni.bidon.bo.Film;
import org.springframework.ui.Model;

@Service
public class FilmServiceImpl implements FilmService {
	
	private FilmDao filmDao;
	@Autowired
	public FilmServiceImpl(FilmDao filmDao) {
		this.filmDao = filmDao;
	}

	@Override
	public List<Film> findList() {
		List<Film> films = filmDao.SelectAllFilm();
		return films;
	}

	@Override
	public Film findById(int id) {
		Film film = filmDao.SelectOneFilmById(id);
		return film;
	}

	@Override
	public Film addFilm(String titre, LocalDate date, int duree, String synopsy, Model modele) {
//		Film film = filmDao.SelectOneFilmById(id);
		return null;
	}

}
