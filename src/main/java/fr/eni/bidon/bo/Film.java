package fr.eni.bidon.bo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name= "films")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titre;
	private int annee;
	private int duree; // en minutes
	private String synopsy;
	private Genre genre;
	
	
	private Participant realisateur;
	private List<Participant> acteurs;
	
	private List<Avis> avis;
	
	

	public Film(int id, String titre, int annee, int duree, String synopsy) {
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsy = synopsy;
		this.avis = new ArrayList<Avis>();
	}
	
	public void addOpinion (Avis opinion) {
		this.avis.add(opinion);
	}
}
