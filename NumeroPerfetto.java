import java.util.Scanner;

public class NumeroPerfetto {
	// cerca tutti i divisori di "x" e li memorizza in "a"
	public static void cercaDivisori(int x, int[] a, Scanner in) {
		int i = 1;
		for (; i <= x / 2; i++) {
			if (x % i == 0)
				a[i] = i;
		}
	}

	// ricevuto un numero e i suoi divisori verifica se e' perfetto
	public static boolean perfetto(int a[], int n) {
		int somma = 0;
		for (int i = 0; i < a.length; i++) {
			somma += a[i];
		}
		return somma == n;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci un numero ");
		int n = in.nextInt();
		int pippo[];
		pippo = new int[n / 2 + 1];
		cercaDivisori(n, pippo, in);

		if (perfetto(pippo, n))
			System.out.append("Si " + n + " è un numero perfetto.");
		else
			System.out.append("No " + n + " non è un numero perfetto.");
		in.close();
	}
}