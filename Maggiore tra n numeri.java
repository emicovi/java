package confrontanumeri;

import java.util.Scanner;

public class Maggiore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il numero di valori da confrontare");

		int N=in.nextInt();

		int A = in.nextInt(); // 5
		int max=A; //max =5
		int contatore=0;
		while(contatore < N-1)
		{
         	contatore++;
			A=in.nextInt(); // 30
			if (A>max) 
				max=A; //max = 30
		}
		
				
		System.out.println("Il numero Maggiore è "+max);

		/*		if (A>B && A>C && A>D) {
	        System.out.println("Il numero Maggiore è "+A);
		}
		else  if(B>A && B>C && B>D) {
			System.out.println("Il numero maggiore è "+B);
		}
		else  if(C>A && C>C && C>D) {
			System.out.println("Il numero maggiore è "+C);
		}

		else 
			System.out.println("Il numero maggiore è "+C);
		
		System.out.println("Ciao");
	*/	
		in.close();
		
		}
	
	

}
