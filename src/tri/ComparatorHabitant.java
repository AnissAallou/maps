package tri;

import java.util.Comparator;
 

public class ComparatorHabitant implements Comparator<Pays>{


	
	
	@Override
	public int compare(Pays o1, Pays o2) {
		// TODO Auto-generated method stub
		Pays country1 = (Pays) o1;
		Pays country2 = (Pays) o2;
		
		int nbHabitants = country1.getNbHabitants().compareTo(country2.getNbHabitants());
		return nbHabitants;
	}

}
