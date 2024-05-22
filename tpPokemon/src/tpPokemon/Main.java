package tpPokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		Attaque aireDEau = new Attaque("Aire d'eau", EnumeType.EAU, 80);
		Attaque acideMalique = new Attaque("Acide Malique", EnumeType.PLANTE, 80);
		Attaque acrobatie  = new Attaque("Acrobatie", EnumeType.AIRE, 55);
		Attaque appelAttaque = new Attaque("Appel Attaque", EnumeType.INSECT, 90);
		
		List<Attaque> attaquesPlante =  new ArrayList<>() ;
		attaquesPlante.add(acideMalique);
		
		EspecePokemon saquedeneu = new  EspecePokemon("Saquedeneu",EnumeType.PLANTE,100,attaquesPlante);
		
	}
	
	
	
	

}
