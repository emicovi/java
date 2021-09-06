
public class Esercizio_4 {
	// metodo che verifica se un numero "num" è presente in una matrice "matrix"
	// almeno "n" volte
	public static boolean trovaNumeroInMatrice(int [][] matrix, int num, int n) {
		int nTrovato = 0;
		for (int i = 0; i<matrix.length;i++) {
			for (int j = 0; j<matrix[0].length; j++) {
				if (matrix[i][j]==num) {
					nTrovato++;
				}
				if(nTrovato==n) {
					return true;
				}
			}
		}
		return (nTrovato>=n);
	}

	public static void main(String[] args) {
		/*
		 * Implementare un metodo Java che, ricevuta una matrice contenente numeri interi, 
		 * sia "m", ed due interi "x" ed "n", restituisca "true" se "x" è presente 
		 * in "m" almeno "n" volte.
		 */
		
		int [][] m = {{1,2,3}, {3,13,6}, {27,3,92}, {100,71,3}};
		int x = 3;
		int n = 2;
		if(trovaNumeroInMatrice(m, x, n)) {
			System.out.println(x + " è presente nella matrice almeno " + n + " volte!");
		}
		else {
			System.out.println(x + " non è presente nella matrice.");
		}

	}

}
