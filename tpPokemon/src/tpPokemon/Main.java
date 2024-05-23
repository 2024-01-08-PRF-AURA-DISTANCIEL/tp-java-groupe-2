package tpPokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {


	 public static void main(String[] args) {


		Attaque aireDEau = new Attaque("Aire d'eau", EnumeType.EAU, 80);
		Attaque anneauHydro = new Attaque("Anneau Hydro", EnumeType.EAU, 50);
		Attaque aquaBreche = new Attaque("Aqua-Breche", EnumeType.EAU, 85);
		Attaque aquaJet = new Attaque("Aqua-Jet", EnumeType.EAU, 40);
		
		Attaque acideMalique = new Attaque("Acide Malique", EnumeType.PLANTE, 80);
		Attaque aireDHerbe = new Attaque("Aire d'Herbe", EnumeType.PLANTE, 80);
		Attaque aromathérapie = new Attaque("Aromathérapie", EnumeType.PLANTE, 50);
		Attaque balleGraine = new Attaque("Balle Graine", EnumeType.PLANTE, 25);
		
		Attaque acrobatie  = new Attaque("Acrobatie", EnumeType.AIRE, 55);
		Attaque aéroblast = new Attaque("Aéroblast", EnumeType.AIRE, 100);
		Attaque aéropique = new Attaque("Aéropique", EnumeType.AIRE, 60);
		Attaque antiBrume = new Attaque("Anti-Brume", EnumeType.AIRE, 30);

		Attaque appelAttaque = new Attaque("Appel Attaque", EnumeType.INSECT, 90);
		Attaque appelDéfense = new Attaque("Appel Défense", EnumeType.INSECT, 35);
		Attaque appelSoins = new Attaque("Appel Soins", EnumeType.INSECT, 65);
		Attaque boulePollen = new Attaque("Boule Pollen", EnumeType.INSECT, 55);

		
		List<Attaque> attaquesPlante =  new ArrayList<>() ;
		attaquesPlante.add(acideMalique);
		 System.out.println("Affichage de la liste : ");
		 for (Attaque elementDeLaListe : attaquesPlante) {
			 System.out.println(elementDeLaListe);
		 }


		List<Attaque> attaquesAire =  new ArrayList<>() ;
		attaquesAire.add(acrobatie);
		 System.out.println("Affichage de la liste : ");
		 for (Attaque elementDeLaListe : attaquesAire) {
			 System.out.println(elementDeLaListe);
		 }
		
		List<Attaque> attaquesInsect =  new ArrayList<>() ;
		 attaquesInsect.add(appelAttaque);
		 System.out.println("Affichage de la liste : ");
		 for (Attaque elementDeLaListe : attaquesInsect) {
			 System.out.println(elementDeLaListe);
		 }
		
		List<Attaque> attaquesEAU =  new ArrayList<>() ;
		 attaquesEAU.add(appelAttaque);
		 System.out.println("Affichage de la liste : ");
		 for (Attaque elementDeLaListe : attaquesEAU) {
			 System.out.println(elementDeLaListe);
		 }


		EspecePokemon saquedeneu = new  EspecePokemon("Saquedeneu",EnumeType.PLANTE,100,attaquesPlante);
		EspecePokemon airmure = new  EspecePokemon("Airmure",EnumeType.AIRE,100,attaquesAire);
		EspecePokemon maskadra = new  EspecePokemon("Maskadra",EnumeType.INSECT,100, attaquesInsect);
		EspecePokemon tortank = new  EspecePokemon("Tortank",EnumeType.EAU,100,attaquesEAU);

		 List<Pokemon> pokemons =  new ArrayList<>() ;


		 Pokemon pokemonPlante = new Pokemon("Bulbizarre", 100, maskadra);
		 pokemons.add(pokemonPlante);


		 Pokemon pokemonAire = new Pokemon("Mélofée",100,saquedeneu );
		 pokemons.add(pokemonAire);


		 Pokemon pokemonEAU = new Pokemon("Raichu",100,airmure);
		 pokemons.add(pokemonEAU);


		 Pokemon pokemonInsecte = new Pokemon("Carapuce",100,tortank);
		 pokemons.add(pokemonInsecte);




		 //afficher ensuite dans la console, une liste de commandes que l’on peut effectuer.
		 Scanner scannerClavier = new Scanner(System.in);

		 //L'utilisateur choisit des commandes
		 /*
		 * Exemple : 1- La liste des pokémons
		 * 2- La liste des attaques
		 * 3- La liste des espèces
		 * je dois combiner le switch avec un while si possible
		 * */
		 System.out.println("Veuillez choisir une commande");


		 String commandes = scannerClavier.nextLine();

         switch (commandes) {
			 case "1" :
				 System.out.println("Liste des pokemons");
				 System.out.println(pokemonPlante);
				 System.out.println(pokemonPlante.getUniqueID().hashCode());

				 System.out.println(pokemonAire);
				 System.out.println(pokemonAire.getUniqueID());

				 System.out.println(pokemonEAU);
				 System.out.println(pokemonEAU.getUniqueID());

				 System.out.println(pokemonInsecte);
				 System.out.println(pokemonInsecte.getUniqueID());
				 break;

			 case "2" :
				 System.out.println("Liste des attaques");
				 System.out.println(aireDEau);
				 System.out.println(acideMalique);
				 System.out.println(acrobatie);
				 System.out.println(appelAttaque);
				 break;
			 case "3" :
				 System.out.println("Liste des espèces");
				 System.out.println(saquedeneu);
				 System.out.println(airmure);
				 System.out.println(maskadra);
				 System.out.println(tortank);
				 break;

			 default :
				 System.out.println("Choix incorrect");
         }
     	System.out.println("Bienvenue dans le monde de Pokémon");
		listActiviter();
		int po = scannerClavier.nextInt();	
		switch (po) {
		case 1:
			//listPokemon(listPokemon);
			break;
		case 2:
		//	combat();
			break;
		case 3:
			//discussion(listPokemon);
			break;
		case 4:
		//	promenade(listPokemon);
			break;
		default:
			break;
		}

		scannerClavier.close();

     }
	 
		public static void listActiviter() {
			System.out.println("Tu peux choisir entre ces trois activités.");
			String[] arrayChoix = new String[4];
			arrayChoix[0] = "1 Pokémon";
			arrayChoix[1] = "2 Combat";
			arrayChoix[2] = "3 Discussion";
			arrayChoix[3] = "4 Promenade";
			for (String activiter : arrayChoix) {
				System.out.println(activiter);
			}
		}


		/*
	Discussion
Il est possible de faire discuter les Pokémons. La discussion se déroule comme suit :
•
Un Pokémon est choisi au hasard.
•
Il 'parle' : une ligne est affichée sur la console indiquant le nom du Pokémon et ce qu'il dit.
•
Ce que dit le Pokémon est une 'phrase'constituée du nom de son espèce, dit de une à trois fois (choix aléatoire), et aléatoirement d'un point, d'un point d'exclamation, ou d'un point d'interrogation.
•
On choisit un nouveau Pokémon, et on continue jusqu'à ce que 5 Pokémons aient parlé.
•
Un Pokémon ne peut pas parler plus d'une fois.
	*
	* */





	public static void discuter(List<Pokemon> pokemons){
		//Un pokémon est choisi au hazard

		for(List<Pokemon> element : pokemons)
		pokemons.stream()
				.map(p -> p.getEspecePokemon());



	}
}

