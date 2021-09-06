package sommaNnumeri;

import java.util.Scanner;

public class Somma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int X;
		int N1;
		
		System.out.print("Quanti numeri vuoi sommare?");
		X=in.nextInt();
		
		if(X!=0)
			System.out.print("Inserisci "+ X +" numeri:");
		
		int somma=0;
		int cont=0;
		while(cont<X)
		{
				
			N1=in.nextInt();
			somma=somma+N1;
			cont++;
		}
		
		
		System.out.print("La somma è " + somma);
		
		in.close();
	}

}
