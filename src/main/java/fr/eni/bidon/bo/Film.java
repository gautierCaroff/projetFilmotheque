package fr.eni.bidon.bo;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Film {
	
	private int id;
	private String titre;
	private LocalDate date;
	private int duree; // en minutes
	private String synopsy;

	public Film(int id, String titre, LocalDate date, int duree, String synopsy) {
		this.id = id;
		this.titre = titre;
		this.date = date;
		this.duree = duree;
		this.synopsy = synopsy;
	}
}
