package fr.declaration.variable;

public class boucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while ( i <= 10 ) {
			int carre = i*i;
			String chaine = "le carré de : " + i + " est : " + carre;
			System.out.println(chaine);
			i++;
		}
	}

}
