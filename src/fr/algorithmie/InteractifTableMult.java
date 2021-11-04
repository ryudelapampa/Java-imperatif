package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool = false;
		int nb = 0;
		while (bool == false ) {
			
			Scanner ecrire = new Scanner (System.in);
			System.out.print("Entrer un nombre de 1 à 10 :");  
			nb = ecrire.nextInt();
			
			if (nb >=1 && nb <=10) {
				System.out.println("Félicitation , le nombre écrit est correcte");
				bool = true;
			} else {
				System.out.println("ERREUR , le nombre écrit est INCORRECT");
				bool = false ;
			}
		}
		for (int i = 1; i <= 10; i++ ) {
			System.out.println(nb+" * "+i+" = "+(i*nb));
		}
		
	}

}
