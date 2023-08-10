package fr.eni.bidon.bo;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Film {
	
	private int id;
	private String titre;
	private LocalDate date;
	private int durée; // en minutes
	private String synopsy;
	
	

}
