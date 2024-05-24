package tpPokemon.pokemon;

import java.util.List;



public class EspecePokemon {

	private String nomEspece;
	private EnumeType enumeType;
	static int pointDeVieinit;
	List<Attaque> attaques;



	public EspecePokemon(String nomEspece, EnumeType enumeType, int pointDeVieinit, List<Attaque> attaques) {
		this.nomEspece = nomEspece;
		this.enumeType = enumeType;
		this.pointDeVieinit = pointDeVieinit;
		this.attaques = attaques ;
	}

	public String getNomEspece() {
		return nomEspece;
	}


	public EnumeType getEnumeType() {
		return enumeType;
	}

	
	public static int getPointDeVieinit() {
		return pointDeVieinit;
	}

	public List<Attaque> getAttaques() {
		return attaques;
	}

	@Override
	public String toString() {
		return "EspecePokemon{" +
				"nomEspece='" + nomEspece + '\'' +
				", enumeType=" + enumeType +
				", attaques=" + attaques +
				'}';
	}
}
