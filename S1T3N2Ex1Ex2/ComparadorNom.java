package S1T3N2Ex1Ex2;

import java.util.Comparator;

public class ComparadorNom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Restaurant res1 = (Restaurant) o1;
		Restaurant res2 = (Restaurant) o2;
		
		return res1.getNom().compareTo(res2.getNom());
	}

}
