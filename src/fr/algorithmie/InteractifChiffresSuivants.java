package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb = 0;
		Scanner ecrire = new Scanner (System.in);
		System.out.print("Entrer un nombre :");  
		nb = ecrire.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(nb+i);
		}
		
	}

}
