package fr.declaration.variable;

public class boucleFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			int carre = i * i;
			String chaine = "le carré de " + i + " est " + carre;
			System.out.println(chaine);
		}

	}

}
