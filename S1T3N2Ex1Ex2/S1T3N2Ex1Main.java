package S1T3N2Ex1Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class S1T3N2Ex1Main{
	
	public static void main(String[] args) {
		
		/*- Exercici 1
		Crea una classe anomenada Restaurant amb dos atributs: nom(String) i puntuació(int).
		Implementa els mètodes necessaris perquè no es puguin introduir objectes Restaurant
		amb el mateix nom i la mateixa puntuació en un HashSet creat en el main() de l’aplicació.
 		Important
		Pot haver-hi restaurants amb el mateix nom amb diferent puntuació,
		però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.*/
	
		Set<Restaurant> restaurants = new HashSet<Restaurant>();
		Restaurant restaurant1 = new Restaurant("Tapas Joselito", 7);
		Restaurant restaurant2 = new Restaurant("Restaurante Pedro", 7);
		Restaurant restaurant3 = new Restaurant("Tapas Joselito", 7);
		Restaurant restaurant4 = new Restaurant("Tapas Joselito", 8);
		Restaurant restaurant5 = new Restaurant("Restaurante Pedro", 10);
	
		restaurants.add(restaurant1);
		restaurants.add(restaurant2);
		restaurants.add(restaurant3);
		restaurants.add(restaurant4);
		restaurants.add(restaurant5);
		
		for(Restaurant restaurant : restaurants) {
			System.out.println(restaurant.getNom() + " " + restaurant.getPuntiacio());
		}
		System.out.println("\n----------------\n");
		/*Utilitzant la classe del programa anterior, 
		crea la implementació necessària perquè els objectes de la classe Restaurant
		estiguin ordenats per nom i per puntuació en ordre ascendent. 

		Exemple:
		nom: restaurant1, puntuació: 8
		nom: restaurant1, puntuació: 7*/
		
		List<Restaurant> restaurantsList = new ArrayList<>(restaurants);
		Collections.sort(restaurantsList, new ComparadorPuntuacio());
		Collections.sort(restaurantsList, new ComparadorNom());
		
		for(Restaurant r : restaurantsList) {
			System.out.println(r.getNom() + " " + r.getPuntiacio());
		}
	
		
	}
}
