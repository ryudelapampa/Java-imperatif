package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nb = 0;
		int arit = 0;
		Scanner ecrire = new Scanner (System.in);
		System.out.print("Entrer un nombre :");  
		nb = ecrire.nextInt();
		
		for (int i = 1; i <= nb; i++) {
			
			arit = arit+i;
			
		}
		System.out.println(arit);
	}

}
