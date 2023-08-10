package fr.eni.bidon.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import fr.eni.bidon.Dal.FilmDao;
import fr.eni.bidon.bo.Film;


public class FilmServiceImpl implements FilmService {
	
	private FilmDao filmDao;
	@Autowired
	public FilmServiceImpl(FilmDao filmDao) {
		this.filmDao = filmDao;
	}

	@Override
	public List<Film> findList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film findById() {
		// TODO Auto-generated method stub
		return null;
	}

}
