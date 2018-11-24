package maps;

import java.util.HashMap;
import java.util.Scanner;

import sets.Pays;

public class TestMapPays {

	public static void main(String[] args) {

		
		Pays[] nations = {new Pays("USA", 325700000, 59531.66),
						  new Pays("France", 66860000, 38476.66),
						  new Pays("Allemagne", 82790000, 44469.91),
						  new Pays("UK", 66020000, 39720.44),
						  new Pays("Italie", 60590000, 31952.98),
						  new Pays("Japon", 126800000, 38428.10),
						  new Pays("Chine", 1386000000, 8826.99),
						  new Pays("Russie", 144500000, 10743.10),
						  new Pays("Inde", 1225000000, 1939.61) };
		
		HashMap<String, Pays> country = new HashMap<String, Pays>();
		
	
		
		for (Pays pays : nations) {
			country.put(pays.getNom(), pays);
		}
		
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		boolean outOfProgram = false;
		
		while(!outOfProgram) {
			
			System.out.println("0 - Exit\n1 - Afficher les informations concernant un pays\n2 - Supprimer un pays\n3 - Afficher la liste des pays");
			
			int option = sc.nextInt();
			sc.nextLine();

			if(option == 0) {
				System.out.println("Sortie");
				outOfProgram = true;
			} else if(option==1) {
				System.out.println("Quel pays ?");
				String nom = sc.nextLine();
				if(country.containsKey(nom)) {
					System.out.println(country.get(nom));
				} else {
				System.out.println("Il n'y est pas");
				}
			} else if(option == 2) {
				System.out.println("Quel pays ?");
				String removeNom = sc.nextLine();
				if(country.containsKey(removeNom)) {
					country.remove(removeNom);
				} else {
				System.out.println("Il n'y est pas");
				}
			} else if(option == 3) {
				System.out.print(country + " " + "\n");
			} 
			
			
		}
		
		

		
	}

}