package fr.algorithmie;
import java.util.Scanner; 

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean bool = false;
		while (bool == false ) {
			
			Scanner ecrire = new Scanner (System.in);
			System.out.print("Entrer un nombre de 1 à 10 :");  
			int i = ecrire.nextInt();
			
			if (i >=1 && i <=10) {
				System.out.println("Félicitation , le nombre écrit est correcte");
				bool = true;
			} else {
				System.out.println("ERREUR , le nombre écrit est INCORRECT");
				bool = false ;
			}
		}
		
	}

}
