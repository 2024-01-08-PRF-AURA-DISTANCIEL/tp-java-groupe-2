package tpPokemon;

public class Attaque {

	private String nom;
	private EnumeType type;
	private int pointDeDegat;
	
	public Attaque(String nom, EnumeType type, int pointDeDegat) {
		super();
		this.nom = nom;
		this.type = type;
		this.pointDeDegat = pointDeDegat;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	public EnumeType getType() {
		return type;
	}
	public void setType(EnumeType type) {
		this.type = type;
	}
	public int getPointDeDegat() {
		return pointDeDegat;
	}
	public void setPointDeDegat(int pointDeDegat) {
		this.pointDeDegat = pointDeDegat;
	}
	
	@Override
	public String toString() {
		return "Attaque [nom=" + nom + ", type=" + type + ", pointDeDegat=" + pointDeDegat + "]";
	}	

}
