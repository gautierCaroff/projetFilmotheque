package fr.eni.bidon.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.bidon.Dal.FilmDao;
import fr.eni.bidon.bo.Film;
import fr.eni.bidon.bo.Opinion;

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
	public void AddOpinion(Film film, Opinion opinion) {
		filmDao.CreateOpinion(film, opinion);
		
	}

	

}
