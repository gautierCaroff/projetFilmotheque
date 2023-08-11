package fr.eni.bidon.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Film {

	private int id;

	@NotBlank(message = "le Titre ne peu pas être vide")
	private String titre;

	@NotNull(message = "la Date ne peut pas être vide")
	private LocalDate date;

	@NotNull(message = "la durée ne peut pas être vide")
	private int duree; // en minutes

	@NotBlank(message = "le Synopsy ne peu pas être vide")
	private String synopsy;
	private List<Opinion> opinions;

	public Film(int id, String titre, LocalDate date, int duree, String synopsy) {
		this.id = id;
		this.titre = titre;
		this.date = date;
		this.duree = duree;
		this.synopsy = synopsy;
		this.opinions = new ArrayList<Opinion>();
	}
	
	public void addOpinion (Opinion opinion) {
		this.opinions.add(opinion);
	}
}