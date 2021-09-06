import java.util.Scanner;

public class TuttiPari {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int X;
		int N1;
		
		System.out.print("Quanti numeri vuoi inserire?");
		X=in.nextInt();
		
		int cont=0;
		boolean trovatoUnDispari=false;
		while(cont<X)
		{
			System.out.print("Inserisci un numero");
			N1=in.nextInt();
			if (N1%2!=0)
				trovatoUnDispari=true;
			
			cont++;
		}
		
		if(trovatoUnDispari)	
			System.out.print("NON TUTTI PARI");
		else
			System.out.print("TUTTI PARI");
		
		in.close();
	}

}
