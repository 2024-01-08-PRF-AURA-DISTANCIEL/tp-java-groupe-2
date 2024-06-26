package tpPokemon.pokemon;

import java.util.List;
import java.util.Scanner;

public class Promenades {

	Scanner scannerClavier = new Scanner(System.in);

	public void listPokemon(List<Pokemon> pokemons) {
		System.out.println("Choisisez un pokemon à promener");
		int i=1;
		for (Pokemon pokemon : pokemons) {
			System.out.println(i+" - "+pokemon.getNom()+" - Type : "+pokemon.getEspecePokemon().getEnumeType()+" - Points de vie : "+pokemon.getPointDeVie());
			i++;
		}
	}

	public Pokemon choixPokemon(List<Pokemon> pokemons) {
		int choix = scannerClavier.nextInt();
		while(choix <= 0 || choix > pokemons.size()) {
			System.out.print("Entré un choix valide");
			choix = scannerClavier.nextInt();
		}

		scannerClavier.nextLine(); // vidage buffer
		return pokemons.get(choix-1);

	}

	public void listDesPromenades() {
		System.out.println("Ou voulez-vous promener votre pokemon ?");
		int i=1;
		for (EnumePromenade promenade : EnumePromenade.values()) {
			System.out.println(i+" - "+promenade);
			i++;
		}
	}

	public EnumePromenade choixDeLaPromenade() {
		EnumePromenade choix = null;
		String commande = scannerClavier.nextLine();
		System.out.println(commande);

		switch (commande) {
			case "1":
				choix= EnumePromenade.PLAGE;
				break;
			case "2":
				choix= EnumePromenade.JUNGLE;
				break;
			case "3":
				choix= EnumePromenade.VOLCAN;
				break;
			case "4":
				choix= EnumePromenade.DESERT;
				break;
		}
		return choix;
	}

	public void promenades(List<Pokemon> pokemons) {
		this.listPokemon(pokemons);
		Pokemon pokemon=choixPokemon(pokemons);
		this.listDesPromenades();
		EnumePromenade lieuPromenade=this.choixDeLaPromenade();

		Boolean isLike=false;
		System.out.println("lieu promenade : "+lieuPromenade);
		if(pokemon.getEspecePokemon().getEnumeType()==EnumeType.EAU && lieuPromenade==EnumePromenade.PLAGE) {
			isLike=true;
		}else if(pokemon.getEspecePokemon().getEnumeType()==EnumeType.INSECT && lieuPromenade==EnumePromenade.JUNGLE) {
			isLike=true;
		}else if(pokemon.getEspecePokemon().getEnumeType()==EnumeType.PLANTE && lieuPromenade==EnumePromenade.VOLCAN) {
			isLike=true;
		}else if(pokemon.getEspecePokemon().getEnumeType()==EnumeType.AIRE && lieuPromenade==EnumePromenade.DESERT) {
			isLike=true;
		}

		if(isLike) {
			System.out.println("Le pokemon "+pokemon.getNom()+" a apprécié la promenade");
			int oldXP=pokemon.getPointExperience();
			System.out.println("Point d'XP avant promenade : "+oldXP);
			pokemon.setPointExperience(oldXP+2);
			int newXP=pokemon.getPointExperience();
			System.out.println("Vous avez gagné 2 points d'XP !");
			System.out.println("Point d'XP après promenade : "+newXP);

			if(oldXP % 5 >= newXP % 5) {
				pokemon.setNiveau(pokemon.getNiveau()+1);
				System.out.println("Vous êtes montées au niveau " +pokemon.getNiveau());
			}
		}else {
			System.out.println("Le pokemon "+pokemon.getNom()+" n'a pas apprécié la promenade !");
		}

	}
}