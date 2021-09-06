import java.util.Scanner;

public class Esercizio_7 {
	
	public static int[] leggiInput(Scanner scanner) {
		System.out.println("Quanti numeri vuoi inserire ?");
		int n = scanner.nextInt();
		System.out.println("Inserisci " + n + " numeri :");
		int numeri[] = new int[n];

		for (int i = 0; i < n; i++) {
			numeri[i] = scanner.nextInt();
		}
		return numeri;
	}
	// ciclo nell'array "arr2" per determinare se "arr1" è un suo sotto-array 
	public static boolean trovaSottoArray(int[] arr1, int[] arr2) {
		int interiUguali = 0;
		for (int i=0; i<arr2.length-arr1.length; i++) {
			if (arr2[i] == arr1[0]) {
				interiUguali = 1;
				for (int j=1; j<arr1.length; j++) {
					if (arr1[j] == arr2[i+j]) {
						interiUguali++;
					}
				}
				if (interiUguali == arr1.length) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		/*
		 * Si implementi in Java un metodo che, ricevuti due array di interi "v1" e "v2", 
		 * restituisca "true" se "v1" compare interamente come sotto-array di "v2". 
		 * Restituisca "false" altrimenti. 
		 * ESEMPIO: se gli array fossero v1 = [2,6,2] 
		 * e v2 = [5,3,7,1,8,2,6,2,8,4,6,2], allora bisognerebbe restituire "true"
		 */
		Scanner scanner = new Scanner(System.in);
		int[] v1 = leggiInput(scanner);
		int[] v2 = leggiInput(scanner);
		scanner.close();
		
		if(trovaSottoArray(v1, v2)) {
			System.out.println("Il primo array è un sotto-array del secondo!");
		} else {
			System.out.println("Il primo array non è un sotto-array del secondo.");
		}
	}
	// 5 3 7 1 8 2 6 2 8 4 6 2
}
