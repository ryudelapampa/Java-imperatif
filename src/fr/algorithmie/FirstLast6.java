package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		int[] tab = {6, 12, -5, 7 };
		int i = 0;
		boolean trueFalse = false;
		if (tab[0] == 6 || tab[tab.length-1] == 6 ) {
			trueFalse = true;
			System.out.println("l'affirmation est : "+trueFalse);
		}else {
			System.out.println("l'affirmation est : "+trueFalse);
		}
	}

}
