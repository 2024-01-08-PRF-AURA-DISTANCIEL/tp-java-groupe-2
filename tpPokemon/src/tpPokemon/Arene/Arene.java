package tpPokemon.Arene;

import tpPokemon.pokemon.Pokemon;

public class Arene {

	private TypeArene typeArene;

	public Arene(TypeArene typeArene) {
		// TODO Auto-generated constructor stub
		this.typeArene = typeArene;
	}

	public void agitAuDebutDuCombat(Pokemon pokemon1, Pokemon pokemon2) {
		// Initialisation des points de vie à MAX.
		pokemon1.setPointDeVie(pokemon1.getPointDeVieMax());
		pokemon2.setPointDeVie(pokemon2.getPointDeVieMax());

		switch (this.typeArene) {
			case CHAMP:
				break;
			case VILLE:
				break;
			case VOLCAN:
				pokemon1.setPointDeVie(pokemon1.getPointDeVie()-5);
				System.out.println("Le pokemon "+pokemon1.getNom()+" à perdu 5 points de vie");
				pokemon2.setPointDeVie(pokemon2.getPointDeVie()-5);
				System.out.println("Le pokemon "+pokemon2.getNom()+" à perdu 5 points de vie");
				break;
			case MARAIS:

				break;
			default:
				break;
		}
	}


	public void agitAuDebutDuTour(Pokemon pokemon1, Pokemon pokemon2) {
		switch (this.typeArene) {
			case CHAMP:

				break;
			case VILLE:

				break;
			case VOLCAN:

				break;
			case MARAIS:
				pokemon1.setPointDeVie(pokemon1.getPointDeVie()-1);
				System.out.println("Le pokemon "+pokemon1.getNom()+" à perdu 1 points de vie");
				pokemon2.setPointDeVie(pokemon2.getPointDeVie()-1);
				System.out.println("Le pokemon "+pokemon1.getNom()+" à perdu 1 points de vie");
				break;
			default:

				break;
		}
	}

	public void combat(Pokemon pokemon1, Pokemon pokemon2) {
		agitAuDebutDuCombat(pokemon1, pokemon2);


		//Combattant A attaque
		pokemon1.setPointDeVie(pokemon1.getPointDeVie()- pokemon2.getAttaque().getPointDeDegat());

		System.out.println(pokemon2.getNom() + " a attaqué " + pokemon1.getPointDeVie() +  " et " + pokemon1.getNom() + " a perdu : " + pokemon2.getAttaque().getPointDeDegat() );
		//Combattant B perd des points de vie
		pokemon2.setPointDeVie(pokemon2.getPointDeVie()- pokemon1.getAttaque().getPointDeDegat());
		System.out.println(pokemon1.getNom() + " a attaqué " + pokemon2.getPointDeVie() +  "et " + pokemon2.getNom() +" a perdu : " + pokemon1.getAttaque().getPointDeDegat() );


	}

}