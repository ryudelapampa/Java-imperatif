package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombreAleatoire = 0 + (int)(Math.random() * ((100 - 0) + 1));
		boolean resultat = false;
		System.out.println(nombreAleatoire);
		
		while (resultat == false) {
			Scanner ecrire = new Scanner (System.in);
			System.out.print("Entrer un num�ro : ");  
			int nb = ecrire.nextInt();
			if (nb == nombreAleatoire) {
				resultat = true;
			} else {
				if (nb < nombreAleatoire) {
					System.out.println("Vous etes en dessous du nombre recherch�");
				} else if (nb > nombreAleatoire) {
					System.out.println("Vous etes au dessus du nombre recherch�");
				}
				resultat = false;
			}
		}
		System.out.println("F�licitation !!! Vous avez trouv� le bon nombre !!! ");
		
	}

}
