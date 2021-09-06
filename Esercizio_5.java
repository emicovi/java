import java.util.Scanner;

public class Esercizio_5 {
	

	public static int fibonacciIterativo(int x) {
		if(x<=1) {
			return x;
		}
		int res = 0;
		int n1 = 0, n2 = 1;
		for (int i = 2; i<=x; i++) {
			res=(n1 + n2);
			n1=n2;
			n2=res;
		}
		return res;
	}
	
	public static int fibonacciRicorsivo(int x) {
		if (x<=1) {
			return x;
		}
		return fibonacciRicorsivo(x-1) + fibonacciRicorsivo(x-2);
	}

	public static void main(String[] args) {
		/*
		 * Implementare un metodo Java che, ricevuto un numero intero "n", 
		 * restituisca l'n-esimo numero della serie di Fibonacci. 
		 * Si provi a risolvere il problema sia con tecniche "iterative" 
		 * che con tecniche di tipo "ricorsivo".
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero intero :");
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fibonacciIterativo(n));
		System.out.println(fibonacciRicorsivo(n));

	}

}
