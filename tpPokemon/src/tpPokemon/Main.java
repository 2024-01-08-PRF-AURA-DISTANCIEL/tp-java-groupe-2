package tpPokemon;

import java.util.ArrayList;
import java.util.List;


public class Main {

<<<<<<< HEAD
	public static void main(String[] args) {
=======
	 public static void main(String[] args) {
>>>>>>> f8d7d5ff4d0ec15995bbcba9650619987f866fdd
		Attaque aireDEau = new Attaque("Aire d'eau", EnumeType.EAU, 80);
		Attaque acideMalique = new Attaque("Acide Malique", EnumeType.PLANTE, 80);
		Attaque acrobatie  = new Attaque("Acrobatie", EnumeType.AIRE, 55);
		Attaque appelAttaque = new Attaque("Appel Attaque", EnumeType.INSECT, 90);
		
		List<Attaque> attaquesPlante =  new ArrayList<>() ;
		attaquesPlante.add(acideMalique);

		
		
		List<Attaque> attaquesAire =  new ArrayList<>() ;
		attaquesPlante.add(acrobatie);
		
		List<Attaque> attaquesInsect =  new ArrayList<>() ;
		attaquesPlante.add(appelAttaque);
		
		List<Attaque> attaquesEAU =  new ArrayList<>() ;
		attaquesPlante.add(appelAttaque);
		
		EspecePokemon saquedeneu = new  EspecePokemon("Saquedeneu",EnumeType.PLANTE,100,attaquesPlante);
		EspecePokemon airmure = new  EspecePokemon("Airmure",EnumeType.AIRE,100,attaquesPlante);
		EspecePokemon maskadra = new  EspecePokemon("Maskadra",EnumeType.INSECT,100,attaquesPlante);
		EspecePokemon tortank = new  EspecePokemon("Tortank",EnumeType.EAU,100,attaquesPlante);


		Pokemon pokemon1 = new Pokemon("Pikachu", 1, 0,100,maskadra );

		Pokemon pokemon2 = new Pokemon("Raichu", 2, 8,100,maskadra );





	}
	
	
	
	

}
