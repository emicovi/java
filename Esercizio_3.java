import java.util.Scanner;

public class Esercizio_3 {
	
	public static boolean trovaLoZero(int n) {
		if (n<0) {
			return true;
		}
		if (n%10==0) {
			return false;
		}
		//System.out.println("n = " + n);
		return trovaLoZero(n/10);
	}

	public static void main(String[] args) {
		/*
		 * Implementare un metodo ricorsivo Java che dato un numero restituisca true 
		 * se nessuna delle cifre del numero è pari a 0 e false altrimenti.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero :");
		int num = scanner.nextInt();
		scanner.close();
		System.out.println(trovaLoZero(num));
	}

}
