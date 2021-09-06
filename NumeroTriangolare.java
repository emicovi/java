import java.util.Scanner;

public class NumeroTriangolare {

	public static boolean numeroTriangolare(int X) {
		int somma = 0;
		for (int A = 1; somma < X; A++) {
			somma += A;
		}
		return (somma == X);
	}

	public static void stampaTriangolo(int X) {
		for (int A = 1, somma = 0; somma < X; A++) {
			somma += A;
			for (int c = 0; c < A; c++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Inserisci un numero");
		int X = in.nextInt();

		if (numeroTriangolare(X)) {
			System.out.println("Il numero è triangolare");
			stampaTriangolo(X);
		}

		else
			System.out.println("Il numero non è triangolare");
		in.close();
	}

}