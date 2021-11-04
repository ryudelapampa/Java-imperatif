package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		int i = 0;
		while (i < array.length) {
			if (array[i] > 3 ) {
				System.out.println(array[i]);
			}
			i++;
		}
		
		
		
	}

}
