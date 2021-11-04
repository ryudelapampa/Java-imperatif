package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		float moy = 0;
		int i = 0;
		
		while (i < array.length) {
			moy = moy + array[i];
			i++;
		}
		moy = moy/array.length;
		System.out.println("la moyenne du tableau est : "+moy);
	}

}
