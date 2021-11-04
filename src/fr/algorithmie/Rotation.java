package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tab = {4, 4, 8, 16, 24};
		int[] tabRota = new int[tab.length];
		int x = 4;
		
		for (int i = 0; i < tab.length; i++) {
			tabRota[i] = tab[x];
			
			System.out.println("L'index : "+i +" du tableau 2 est " +tabRota[i]);
			x--;
		}
	}
}
