package fr.algorithmie;
import java.util.Scanner; 

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean bool = false;
		while (bool == false ) {
			
			Scanner ecrire = new Scanner (System.in);
			System.out.print("Entrer un nombre de 1 � 10 :");  
			int i = ecrire.nextInt();
			
			if (i >=1 && i <=10) {
				System.out.println("F�licitation , le nombre �crit est correcte");
				bool = true;
			} else {
				System.out.println("ERREUR , le nombre �crit est INCORRECT");
				bool = false ;
			}
		}
		
	}

}
