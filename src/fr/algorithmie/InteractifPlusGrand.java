package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = new int[10];
		int max = 0;
		for (int i = 0; i < 10; i++) {
			Scanner ecrire = new Scanner (System.in);
			System.out.print("nombre numéro "+(i+1)+" : ");  
			int nb = ecrire.nextInt();
			tab[i] = nb;
		}
		int i = 0;
		while (i < tab.length) {
			if (max < tab[i]) {
				max = tab[i];
			}
			i++;
		}
		System.out.println("La valeur max du tableau est : "+max);
	}

}
