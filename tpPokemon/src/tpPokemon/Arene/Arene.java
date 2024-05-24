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
			System.out.println("Le pokemon "+pokemon1.getNom());
			pokemon2.setPointDeVie(pokemon2.getPointDeVie()-5);
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

            break;
        default:

            break;
        }
	}

}
