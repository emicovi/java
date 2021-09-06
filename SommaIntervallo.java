package sommaIntervalloXY;

import java.util.Scanner;

public class SommaIntervallo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Inserisci estremi intervallo");
		
		int X,Y;
		Scanner in=new Scanner(System.in);
				
		X=in.nextInt(); 
		Y=in.nextInt(); 
				
		int somma=0;
		while(X<=Y)
		{			
		somma=somma+X;
		X++;
		}
				
		System.out.print("La somma è " + somma);
				
		in.close();
	}
}
