package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool = false;
		int nb = 0;
		while (bool == false ) {
			
			Scanner ecrire = new Scanner (System.in);
			System.out.print("Entrer un nombre de 1 � 10 :");  
			nb = ecrire.nextInt();
			
			if (nb >=1 && nb <=10) {
				System.out.println("F�licitation , le nombre �crit est correcte");
				bool = true;
			} else {
				System.out.println("ERREUR , le nombre �crit est INCORRECT");
				bool = false ;
			}
		}
		for (int i = 1; i <= 10; i++ ) {
			System.out.println(nb+" * "+i+" = "+(i*nb));
		}
		
	}

}
