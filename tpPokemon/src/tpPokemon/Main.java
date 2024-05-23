package tpPokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {


	 public static void main(String[] args) {

		Attaque aireDEau = new Attaque("Aire d'eau", EnumeType.EAU, 80);
		Attaque acideMalique = new Attaque("Acide Malique", EnumeType.PLANTE, 80);
		Attaque acrobatie  = new Attaque("Acrobatie", EnumeType.AIRE, 55);
		Attaque appelAttaque = new Attaque("Appel Attaque", EnumeType.INSECT, 90);
		
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

		 List<Pokemon> pokemonsPlante =  new ArrayList<>() ;
		 Pokemon pokemon1 = new Pokemon("Bulbizarre", 100, maskadra);
		 pokemonsPlante.add(pokemon1);

		 List<Pokemon> pokemonsAire =  new ArrayList<>() ;
		 Pokemon pokemon2 = new Pokemon("Mélofée",100,saquedeneu );
		 pokemonsAire.add(pokemon2);

		 List<Pokemon> pokemonsInsect =  new ArrayList<>() ;
		 Pokemon pokemon3 = new Pokemon("Raichu",100,airmure);
		 pokemonsInsect.add(pokemon3);

		 List<Pokemon> pokemonsEAU =  new ArrayList<>() ;
		 Pokemon pokemon4 = new Pokemon("Carapuce",100,tortank);
		 pokemonsEAU.add(pokemon4);

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
				 System.out.println(pokemon1);
				 System.out.println(pokemon1.getUniqueID());

				 System.out.println(pokemon2);
				 System.out.println(pokemon2.getUniqueID());

				 System.out.println(pokemon3);
				 System.out.println(pokemon3.getUniqueID());

				 System.out.println(pokemon4);
				 System.out.println(pokemon4.getUniqueID());
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
     }
}
