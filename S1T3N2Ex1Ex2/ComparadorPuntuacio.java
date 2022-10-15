package S1T3N2Ex1Ex2;

import java.util.Comparator;

public class ComparadorPuntuacio implements Comparator<Restaurant>{

	@Override
	public int compare(Restaurant rest1, Restaurant rest2) {
		int res;
		if(rest1.getPuntiacio() > rest2.getPuntiacio()) {
			res = 1;
		}else if(rest1.getPuntiacio() < rest2.getPuntiacio()) {
			res = -1;
		}else {
			res = 0;
		}
		return res;
	}

}
