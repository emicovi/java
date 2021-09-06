
public class Esercizio_1 {
	
	public static boolean comparaSommaCrociMatrice(int[][] m) {
		int sumPrincipale = 0;
		int sumSecondaria = 0;
		for (int i = 0; i<m.length && i<m[0].length;i++) {
			sumPrincipale+=m[i][i];
			sumSecondaria+=m[i][m[0].length-1-i];
			}
		System.out.println("Principale : " + sumPrincipale + "; Secondaria : " + sumSecondaria);
		return sumPrincipale==sumSecondaria;
	}

	public static void main(String[] args) {
		/*
		 * Implementare un metodo Java che, ricevuta una matrice contenente numeri interi, 
		 * restituisca true se la somma degli elementi sulla diagonale principale della 
		 * matrice è uguale alla somma degli elementi sulla diagonale secondaria.
		 */

		int [][] m = {{1,2,3}, 
				  	{4,5,6}, 
				  	{7,8,9}};
		System.out.println(comparaSommaCrociMatrice(m));
	}

}
