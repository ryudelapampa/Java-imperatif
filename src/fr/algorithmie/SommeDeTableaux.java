package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
		int length = tab1.length;
		int[] tabSomme = new int[length];
		
		int i = 0;
		int somme = 0;
		
		while (i < tab1.length) {
			somme = tab1[i]+tab2[i];
			tabSomme[i] = somme ;
			//System.out.println(tab1[i]);
			System.out.println(somme);
			i++;
			//System.out.println(tabSomme[i]);
		}
	}

}
