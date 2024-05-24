package tpPokemon;

import tpPokemon.pokemon.*;

import java.util.*;

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

		Attaque acrobatie = new Attaque("Acrobatie", EnumeType.AIRE, 55);
		Attaque aéroblast = new Attaque("Aéroblast", EnumeType.AIRE, 100);
		Attaque aéropique = new Attaque("Aéropique", EnumeType.AIRE, 60);
		Attaque antiBrume = new Attaque("Anti-Brume", EnumeType.AIRE, 30);

		Attaque appelAttaque = new Attaque("Appel Attaque", EnumeType.INSECT, 90);
		Attaque appelDéfense = new Attaque("Appel Défense", EnumeType.INSECT, 35);
		Attaque appelSoins = new Attaque("Appel Soins", EnumeType.INSECT, 65);
		Attaque boulePollen = new Attaque("Boule Pollen", EnumeType.INSECT, 55);

		List<Attaque> attaquesEAU = new ArrayList<>();
		attaquesEAU.add(aireDEau);
		attaquesEAU.add(anneauHydro);
		attaquesEAU.add(aquaBreche);
		attaquesEAU.add(aquaJet);

		List<Attaque> attaquesPlante = new ArrayList<>();
		attaquesPlante.add(acideMalique);
		attaquesPlante.add(aireDHerbe);
		attaquesPlante.add(aromathérapie);
		attaquesPlante.add(balleGraine);

		List<Attaque> attaquesAire = new ArrayList<>();
		attaquesAire.add(acrobatie);
		attaquesAire.add(aéroblast);
		attaquesAire.add(aéropique);
		attaquesAire.add(antiBrume);

		List<Attaque> attaquesInsect = new ArrayList<>();
		attaquesInsect.add(appelAttaque);
		attaquesInsect.add(appelDéfense);
		attaquesInsect.add(appelSoins);
		attaquesInsect.add(boulePollen);
		
		EspecePokemon saquedeneu = new EspecePokemon("Saquedeneu", EnumeType.PLANTE, 100, attaquesPlante);
		EspecePokemon airmure = new EspecePokemon("Airmure", EnumeType.AIRE, 100, attaquesAire);
		EspecePokemon maskadra = new EspecePokemon("Maskadra", EnumeType.INSECT, 100, attaquesInsect);
		EspecePokemon tortank = new EspecePokemon("Tortank", EnumeType.EAU, 100, attaquesEAU);

		List<EspecePokemon> especesPokemons=new ArrayList<>();
		especesPokemons.add(saquedeneu);
		especesPokemons.add(airmure);
		especesPokemons.add(maskadra);
		especesPokemons.add(tortank);
		
		List<Pokemon> pokemons = new ArrayList<>();


		Pokemon pokemonPlante = new Pokemon("Bulbizarre", 100, maskadra);
		Pokemon pokemonAire = new Pokemon("Mélofée", 100, saquedeneu);
		Pokemon pokemonEAU = new Pokemon("Raichu", 100, airmure);
		Pokemon pokemonInsecte = new Pokemon("Carapuce", 100, tortank);
		Pokemon pokemonEAU2 = new Pokemon("Psykokwak",100,maskadra);
		Pokemon pokemonPlante2 = new Pokemon("Empiflor", 100, tortank);
		Pokemon pokemonAire2 = new Pokemon("Ptéra", 100, airmure);


		pokemons.add(pokemonPlante);
		pokemons.add(pokemonAire);
		pokemons.add(pokemonEAU);
		pokemons.add(pokemonInsecte);
		pokemons.add(pokemonEAU2);
		pokemons.add(pokemonPlante2);
		pokemons.add(pokemonAire2);

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

		 Promenades promenades=new Promenades();
		 
		 //afficher ensuite dans la console, une liste de commandes que l’on peut effectuer.
		 Scanner scannerClavier = new Scanner(System.in);

		//Pokemon choisi au hazard à partir de la liste pokemons
		System.out.println("Elements de la liste : ");
		for(int i = 0; i < pokemons.size(); i++ ) {
			// to print the elements in the list
			System.out.println(pokemons.get(i));
		}

		/*System.out.println("Initier une discussion avec un pokemon");
		discussion(pokemons);*/

		//L'utilisateur choisit des commandes
		/*
		 * Exemple : 1- La liste des pokémons
		 * 2- La liste des attaques
		 * 3- La liste des espèces
		 * je dois combiner le switch avec un while si possible
		 * */
		/*
		 System.out.println("Veuillez choisir une commande");
		 System.out.println("1 - Liste des pokemons");
		 System.out.println("2 - Liste des attaques");
		 System.out.println("3 - Liste des espèces");

		String commandes = scannerClavier.nextLine();

		switch (commandes) {
			case "1":
				System.out.println("Liste des pokemons");
				displayGenericTypeList(pokemons);
				/*System.out.println(pokemonPlante);
				System.out.println(pokemonPlante.getUniqueID().hashCode());
				System.out.println(pokemonAire);
				System.out.println(pokemonAire.getUniqueID());
				System.out.println(pokemonEAU);
				System.out.println(pokemonEAU.getUniqueID());
				System.out.println(pokemonInsecte);
				System.out.println(pokemonInsecte.getUniqueID());
				break;

			case "2":
				System.out.println("Liste des attaques");
				displayListAttacks(attaquesEAU);
				displayListAttacks(attaquesPlante);
				displayListAttacks(attaquesAire);
				displayListAttacks(attaquesInsect);
				/*System.out.println(aireDEau);
				System.out.println(acideMalique);
				System.out.println(acrobatie);
				System.out.println(appelAttaque);
				break;
			case "3":
				System.out.println("Liste des espèces");
				displayGenericTypeList(especesPokemons);
				/*System.out.println(saquedeneu);
				System.out.println(airmure);
				System.out.println(maskadra);
				System.out.println(tortank);
				break;

			default:
				System.out.println("Choix incorrect");
		}*/


		//Interface d'utilisation
		/*
		 * Lance la fonction d'affiche pour l'utilisateur avec un switch
		 * permet de continuer le programme en fonction du choix de l'utilisateur
		 *
		 * */

     	System.out.println("Bienvenue dans le monde de Pokémon");
		listActiviter();
		int po = scannerClavier.nextInt();
		do {

			switch (po) {
				case 1:
		//			listPokemon(listPokemon);
					System.out.println("List pokemon");
					break;
				case 2:
				//	combat();
					System.out.println("Combat");
					break;
				case 3:
					System.out.println("Discussion");
					discussion(pokemons);

					break;
				case 4:
					promenades.promenades(pokemons);
					break;
				default:
					if(po == 0) {
						System.out.println("Vous avez quittez le monde des Pokemons");
						break;
					}else {
						System.out.println("Merci de rentrer un choix valide.");
					}
					break;
				}
			System.out.println("Voulez-vous faire un autre choix ? Sinon tapez 0 pour quitter.");
			po = scannerClavier.nextInt();
		}while(po != 0);
		scannerClavier.close();
 }

	/**
	 * Méthode qui permet de faire discuter des pokémons entre eux
	 * @param pokemons
	 */
	public static void discussion(List<Pokemon> pokemons) {
		/*Random rndm = new Random();

		Pokemon rndmElem = pokemons.get(rndm.nextInt(pokemons.size()));
		System.out.println("Selection  d'un element random à partir de la liste : " + rndmElem);*/

		//Faire parler un pokemon pour cela
		/*exple :  pokemons.getNom() + (ce qu'il dit)
		* ce qu'il dit : phrase(chainedecaractere) (pokemon+getEspeceDePokemon() (1 à 3 fois en random) +
		*  point (randomly) /ou point d'exclamation (randomly)/ou point d'interrogation (randomly)
		* */

		/*Random r = new Random();
		int nbr1 = 1;
		int nbr2 = 3;
		int resultat = r.nextInt(nbr2-nbr1) + nbr1;*/

		System.out.println("On affiche de manière aléatoire le nom d'un pokemon : ");
		for(int i = 0; i <= 5; i++ ) {
			String pokemonQuiAParler = pokemons.get(i).getNom();
			//System.out.println("J'ai parlé : " + pokemonQuiAParler);
			Random rndm = new Random();
			Pokemon rndmElem = pokemons.get(rndm.nextInt(pokemons.size()));

			System.out.println("Selection  d'un element random à partir de la liste : " + rndmElem);

			if(!pokemonQuiAParler.equals(rndmElem.getNom())){
				System.out.println("Je m'appelle " + pokemonQuiAParler + " j'appartiens à l'espèce " + rndmElem.getEspecePokemon().getNomEspece() + ponctuationAleatoire());
		}
		}

	}

	public static String ponctuationAleatoire() {
		String[] point = {".", "!", "?"};

		Random r = new Random();

		int i1 =   r.nextInt(point.length);
		return point[i1] ;
	}

	//Fonction qui permet d'afficher les choix pour l'utilisateur 
	/*
	 * 
	 * Exemple : 
	 * 1- La liste des pokémons
	 * 2- le Combat
	 * 3- la Discussion
	 * 4- la Promenade
	 * 
	 * */
	
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
	
	public static void displayListAttacks(List<Attaque> attacks) {
		System.out.println("Affichage de la liste des attaques de type : "+attacks.get(0).getType());
		for (Attaque attack : attacks) {
			System.out.println(attack);
		}
	}
	
	public static <T> void displayGenericTypeList(List<T> objects) {
		System.out.println("Affichage de la liste :");
		for (T object : objects) {
			System.out.println(object);
		}
	}
}

