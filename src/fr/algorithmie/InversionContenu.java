package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] arrayCopy = new int[array.length];
		
		int i = array.length-1;
		int x = 0;
		
		while (i > 0) {
			
			arrayCopy[x] = array[i];
			
			System.out.println(array[x]);
			System.out.println(arrayCopy[x]);
			i--;
			x++;
			
		}
	}

}
