package tpPokemon;

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

	public Pokemon(String nom, int niveau, int pointExperience, int pointDeVieMax, EspecePokemon especePokemon) {
		this.uniqueID = UUID.randomUUID();
		this.nom = nom;
		this.niveau = niveau;
		this.pointExperience = pointExperience;
		this.pointDeVie = pointDeVie;
		this.pointDeVieMax = EspecePokemon.getPointDeVieinit();
		this.especePokemon = especePokemon;
		this.attaque = attaque;
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

}

