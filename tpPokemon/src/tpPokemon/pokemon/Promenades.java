package tpPokemon.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Promenades {
	Scanner scannerClavier = new Scanner(System.in);
	Pokemon air=null;
	{
		Attaque acrobatie  = new Attaque("Acrobatie", EnumeType.AIRE, 55);
		List<Attaque> attaquesAire =  new ArrayList<>() ;
		attaquesAire.add(acrobatie);
		EspecePokemon airmure = new  EspecePokemon("Airmure",EnumeType.AIRE,100,attaquesAire);
		air= new Pokemon("Raichu",100, airmure);
	}
	public void listPokemon() {
		System.out.println("Choisisez un pokemon à promener");
		System.out.println("1");
	}
	
	public Pokemon choixPokemon() {
		String choix = scannerClavier.nextLine();
		switch (choix) {
		case "1":
			System.out.println("Pokemon 1");
			break;
		case "2":
			System.out.println("Pokemon 2");
			break;
		case "3":
			System.out.println("Pokemon 3");
			break;
		case "4":
			System.out.println("Pokemon 4");
			break;
		default:
			break;
		}
		System.out.println("Type de pokemon : "+air.getEspecePokemon().getEnumeType());
		return air;
		
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
	
	public void promenades() {
		this.listPokemon();
		Pokemon pokemon=choixPokemon();
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
//	scannerClavier.close();
}
