package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int i = 0;
		int max = 0;
		
		while (i < array.length) {
			if (max < array[i]) {
				max = array[i];
			}
			i++;
		}
		System.out.println("La valeur max du tableau est : "+max);
	}

}
