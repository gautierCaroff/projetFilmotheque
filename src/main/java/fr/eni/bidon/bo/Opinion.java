package fr.eni.bidon.bo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Opinion {
	
	private int id;
	private int rating;
	private String opinion;

}
