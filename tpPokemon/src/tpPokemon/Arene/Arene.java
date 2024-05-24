package tpPokemon.Arene;

import tpPokemon.pokemon.Pokemon;

public class Arene {

	private TypeArene typeArene;
	
	public Arene(TypeArene typeArene) {
		// TODO Auto-generated constructor stub
		this.typeArene = typeArene;
	}

	public void agitAuDebutDuCombat(Pokemon pokemon1, Pokemon pokemon2) {
		switch(this.typeArene){
			case VOLCAN -> {
				pokemon1.perdPointDeVie(5);

			}

		}
	}


	public void agitAuDebutDuTour(Pokemon pokemon1, Pokemon pokemon2) {

	}

}
