package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 10; i++){ 
			System.out.println(i);
		}
		
		String identite = " Jimmy Garcia ";
		int i = 0;
		
		while (i <= 20) {
			System.out.println(identite +i+" fois");
			i++;
		}
		
		for (int x = 1 ; x <= 100 ; x++) {
			if (x%2 == 0) {
				System.out.println(x);
			}
		}

		for (int x = 1 ; x <= 100 ; x++) {
			if (x%2 != 0) {
				System.out.println(x);
			}
		
		}
	}
}
