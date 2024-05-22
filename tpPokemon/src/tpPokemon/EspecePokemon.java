package tpPokemon;

import java.util.ArrayList;
import java.util.List;



public class EspecePokemon {

	private String nomEspece ;
	private EnumeType enumeType;
	int pointDeVieinit ;
	List<Attaque> attaques = new ArrayList<>();
 
	
	
	
	public EspecePokemon() {
		// TODO Auto-generated constructor stub
		
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
