package tri;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays>{
	
	ComparatorPibHabitant(){
	}

	@Override
	public int compare(Pays o1, Pays o2) {
		// TODO Auto-generated method stub
		Pays country1 = (Pays) o1;
	    Pays country2 = (Pays) o2;
	    
	    int PIB = country1.getPIB().compareTo(country2.getPIB());
		return PIB;
	}
	
	
}
