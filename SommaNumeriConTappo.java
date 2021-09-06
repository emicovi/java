package sommaConTappo;

import java.util.Scanner;

public class Somma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Inserisci quanti numeri vuoi, -50 per terminare");
		
		Scanner in=new Scanner(System.in);
				
		int N=in.nextInt(); 
				
		int somma=0;
		while(N!=-50)
		{			
		somma=somma+N;
		N=in.nextInt();
		}
				
		System.out.print("La somma è " + somma);
				
		in.close();
	}

}
