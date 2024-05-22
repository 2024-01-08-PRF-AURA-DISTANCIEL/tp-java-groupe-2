package tpPokemon;


public class Pokemon {

		// TODO Auto-generated constructor stub
		//Données membres
		private int id;
		private String nom;
		private int niveau;
		private int pointExperience;
		private int pointDeVie;
		private int pointDeVieMax;

		private EspecePokemon especePokemon;

		private Attaque attaque ;


		//Constructeur

	public Pokemon(int id, String nom, int niveau, int pointExperience, int pointDeVie, int pointDeVieMax, EspecePokemon especePokemon, Attaque attaque) {
		this.id = id;
		this.nom = nom;
		this.niveau = niveau;
		this.pointExperience = pointExperience;
		this.pointDeVie = pointDeVie;
		this.pointDeVieMax = pointDeVieMax;
		this.especePokemon = especePokemon;
		this.attaque = attaque;
	}


	//Getters et Setters


	public int getId() {
		return id;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getPointDeVie() {
		return pointDeVie;
	}

	public int getPointDeVieMax() {
		return pointDeVieMax;
	}

}

}
