import java.util.Scanner;

public class Esercizio_2 {
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
	

	public static void invertiElementiArrayRicorsivo(int [] arr, int i) {
		if (i >= arr.length-1-i) {
			return;
		}
		int tmp = arr[i];
		arr[i] = arr[arr.length-1-i];
		arr[arr.length- 1 - i] = tmp;
		invertiElementiArrayRicorsivo(arr, i+1);
	}

	// stampa di un array in modo ricorsivo
	public static void stampaArrayRicorsiva(int [] arr, int i) {
		if (i>=arr.length) {
			System.out.println();
			return;
		}
		System.out.print(arr[i] + " ");
		stampaArrayRicorsiva(arr, i+1);
	}
	
	public static void main(String[] args) {
		/*
		 * Implementare un metodo ricorsivo Java che, ricevuto un array contenente 
		 * numeri interi, inverta il contenuto dell'array 
		 * (ossia il primo elemento diventa l'ultimo, il secondo il penultimo e così via).
		 */

		int[] numeri = leggiInput();
		stampaArrayRicorsiva(numeri, 0);
		invertiElementiArrayRicorsivo(numeri, 0);
		stampaArrayRicorsiva(numeri, 0);
		
	}

}
