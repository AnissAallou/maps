package sets;


import java.util.HashSet;
 
public class Pays { 
	 
	/* 
	 * Classe Pays avec 3 attributs : 
	 * nom : nom du pays 
	 * nbHabitants : population
	 * PIB : PIB par habitant
	 **/
	
	public String nom;
	public int nbHabitants;
	public double PIB;
	
	
	public Pays(String nom, int nbHabitants, double PIB) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.PIB = PIB;
	}
	
	// getters 
	
	public String getNom() {
		return nom;
	}
	
	public int getNbHabitants() {
		return nbHabitants;
	}
	
	public double getPIB() {
		return PIB;
	}
	
	public double getPIBtotal() {
		return PIB*nbHabitants;
	}
	
	// setters
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	public void setPIB(double PIB) {
		this.PIB = PIB;
	}
	
	

	// méthode d'affichage
	public String toString() {
		return "Pays : " + nom + " Population : " + nbHabitants + " PIB par habitant : " + PIB + " PIB total du pays : " + PIB*nbHabitants + "\n";
	}
	

	public static void main(String[] args) {
		
		// HashSet contenant les pays 
		HashSet<Pays> country = new HashSet<Pays>();
		
		country.add(new Pays("USA", 325700000, 59531.66));
		country.add(new Pays("France", 66860000, 38476.66));
		country.add(new Pays("Allemagne", 82790000, 44469.91));
		country.add(new Pays("UK", 66020000, 39720.44));
		country.add(new Pays("Italie", 60590000, 31952.98));
		country.add(new Pays("Japon", 126800000, 38428.10));
		country.add(new Pays("Chine", 1386000000, 8826.99));
		country.add(new Pays("Russie", 144500000, 10743.10));
		country.add(new Pays("Inde", 1225000000, 1939.61));
			
		System.out.print(country + " ");

		Pays upMostPIBbyHabitant = null;
		double PIBMaxByHabitant=Double.MIN_VALUE;
		Pays upMostPIBsum = null;
		double PIBsum = Double.MIN_VALUE;
		Pays lowestPIB = null;
		double minPIB = Double.MAX_VALUE ;
		
		for (Pays countriesPIB : country) {
			if(countriesPIB.getPIB()>PIBMaxByHabitant) {
				PIBMaxByHabitant = countriesPIB.getPIB();
				upMostPIBbyHabitant = countriesPIB;
			} else if(countriesPIB.getPIBtotal() > PIBsum) {
				PIBsum = countriesPIB.getPIBtotal();
				upMostPIBsum = countriesPIB;
			} else if(countriesPIB.getPIBtotal() < minPIB) {
				minPIB = countriesPIB.getPIBtotal();
				lowestPIB = countriesPIB;
			} else if(countriesPIB.getNom().equals(lowestPIB.getNom())){
				countriesPIB.setNom(countriesPIB.getNom().toUpperCase());
			}
		}
		System.out.println("\n\nPays avec le PIB/habitant le plus important : " + upMostPIBbyHabitant.getNom() + "\nPIB/habitant : " + upMostPIBbyHabitant.getPIB());

		System.out.println(" le pays avec le PIB total le plus grand est =>"+ upMostPIBsum.getNom());
		
		// Mettre en MAJUSCULE le nom du pays au PIB le moins élevé
		System.out.println("\nPays avec le PIB total le plus petit : " + lowestPIB.getNom().toUpperCase() + "\n\n");
		
		System.out.println("Pays dont le PIB total le plus petit à supprimer : ");
		
		// Supprimer le pays au PIB total le plus petit
		country.remove(lowestPIB);
		
		// Afficher le tableau avec ses modifications
		System.out.println(country);
		}
}