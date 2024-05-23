package tpPokemon;

import java.util.List;
import java.util.UUID;

public class Pokemon {

	// TODO Auto-generated constructor stub
	//Données membres
	private UUID uniqueID;
	private String nom;
	private int niveau;
	private int pointExperience;
	private int pointDeVie;
	private int pointDeVieMax;

	private EspecePokemon especePokemon;

	private Attaque attaque ;


	//Constructeur

	public Pokemon(String nom, int pointDeVieMax, EspecePokemon especePokemon) {
		this.uniqueID = UUID.randomUUID();
		this.nom = nom;
		this.niveau = 1;
		this.pointExperience = 0;
        this.pointDeVieMax = EspecePokemon.getPointDeVieinit();
		this.especePokemon = especePokemon;
		this.attaque = especePokemon.getAttaques().get(0);

	}

	//Getters et Setters

	public UUID getUniqueID() {
		return UUID.randomUUID();
	}

	public String getNom() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}


	public int getPointExperience() {
		return pointExperience;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public int getPointDeVieMax() {
		return pointDeVieMax;
	}

	public EspecePokemon getEspecePokemon() {
		return especePokemon;
	}
	public Attaque getAttaque() {
		return attaque;
	}

	@Override
	public String toString() {
		return "Pokemon{" +
				"uniqueID=" + uniqueID +
				", nom='" + nom + '\'' +
				", niveau=" + niveau +
				", pointExperience=" + pointExperience +
				", pointDeVie=" + pointDeVie +
				", pointDeVieMax=" + pointDeVieMax +
				", especePokemon=" + especePokemon +
				", attaque=" + attaque +
				'}';
	}

	/*@Override
	public String toString() {
		return "Pokemon [uniqueID=" + uniqueID + ", nom=" + nom + ", niveau=" + niveau + ", pointExperience=" + pointExperience +
				", pointDeVie=" + pointDeVie + ", pointDeVieMax=" + pointDeVieMax + ", especePokemon=" + especePokemon +
				", attaque=" + attaque + "]";
	}*/
}

