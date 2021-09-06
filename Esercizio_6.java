import java.util.Scanner;

public class Esercizio_6 {


	
	// leggo un numero "n" di interi e li inserisco in un array
		public static int[] leggiInput() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Quanti numeri vuoi inserire ?");
			int n = scanner.nextInt();
			System.out.println("Inserisci " + n + " numeri :");
			int numeri[] = new int[n];

			for (int i = 0; i < n; i++) {
				numeri[i] = scanner.nextInt();
			}
			scanner.close();
			return numeri;
		}
		// ciclo in un array per determinare se la sequenza di interi al suo interno
		// è palindroma o no usando un metodo ricorsivo
		public static boolean trovaPalindromoRicorsivo(int [] arr, int i) {
			if (i >= arr.length-1) {
				return true;
			}
			if (arr[i] == arr[arr.length-1-i]) {
				return trovaPalindromoRicorsivo(arr, i+1);
			}
			else {
				return false;
			}
		}

	public static void main(String[] args) {
		/*
		 * Implementare un metodo Java che, ricevuto un array di numeri interi, 
		 * sia "v", restituisca "true" se "v" è palindromo, e "false" altrimenti. 
		 * Si risolva il problema utilizzando tecniche di tipo ricorsivo.
		 */
		
		int[] numeri = leggiInput();
		if(trovaPalindromoRicorsivo(numeri, 0)) {
			System.out.println("L'array è palindromo!");
		}
		else {
			System.out.println("L'array non è palindromo.");
		}

	}

}
