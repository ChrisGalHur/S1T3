package S1T3N1Ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class S1T3N2Ex2Main {
	
	public static void main(String[] args) {
		
		/*- Exercici 2
		-Crea i emplena un List<Integer>. 
		*/
		
		List<Integer> numsR = new ArrayList<>();
		numsR.add(1);
		numsR.add(2);
		numsR.add(3);
		numsR.add(4);
		numsR.add(5);
		
		//-Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 
		//-Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.
		
		List<Integer> numsL = new ArrayList<>();
		
		ListIterator listItR = numsR.listIterator();

		//Recorremos el iterador hacia atrás
		while(listItR.hasNext()) {
			listItR.next();
		}
			
		//Volvemos a recorrer el iterador (que quedó en la quinta posición), pero esta vez hacia atrás
		while(listItR.hasPrevious()) {
			numsL.add((int)listItR.previous());
		}
		
		System.out.println(numsR);
		System.out.println(numsL);
	}

}
