package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean trueFalse = false;
		int[] tab = {-80, 15, -10, 2, -80};
		if (tab.length >=1 && tab[0] == tab[tab.length-1]) {
			trueFalse = true;
		} else {
			trueFalse = false;
		}
		System.out.println("L'affirmation : le tableau comporte au moins 1 élément et son premier et son dernier élément sont de même valeur est : "+trueFalse);
	}
}
