import java.util.Scanner;

public class TuttiPari {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.print("Inserisci quanti numeri vuoi, -50 per terminare");
		
		int N=in.nextInt();
			
		boolean trovatoUnDispari=false;
		while(N!=-50)
		{
			if (N %2!=0)
				trovatoUnDispari=true;
			N=in.nextInt();
		}
		
		if(trovatoUnDispari)	
			System.out.print("NON TUTTI PARI");
		else
			System.out.print("TUTTI PARI");
		
		in.close();
	}
}
