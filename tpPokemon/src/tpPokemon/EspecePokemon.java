package tpPokemon;

import java.util.ArrayList;
import java.util.List;



public class EspecePokemon {

	private String nomEspece ;
	private EnumeType enumeType;
	int pointDeVieinit ;
	List<Attaque> attaques = new ArrayList<>();
 
	
	
	//Constructeur


	public EspecePokemon(String nomEspece) {
		this.nomEspece = nomEspece;
	}

	public String getNomEspece() {
		return nomEspece;
	}


	public EnumeType getEnumeType() {
		return enumeType;
	}

	
	public int getPointDeVieinit() {
		return pointDeVieinit;
	}

	public List<Attaque> getAttaques() {
		return attaques;
	}


	public static void main(String[] args) {
        

	}


}
