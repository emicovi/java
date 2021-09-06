import java.util.Scanner;

public class Gemelli {

	public static boolean primo(int N)
	{
		int d=2;
		boolean primo=true;
		while(d<N/2&&primo==true)
		{
//			System.out.println("provo il divisore"+d);	
			if(N%d==0) 
			{
				//System.out.print("ho trovato un divisore quindi non è primo");
				primo=false;
			}
			d++;
		}
		return primo;
		
	}
	
	public static int valoreAssoluto(int N)
	{
		if(N>0)
			return N;
		else
			return -N;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Inserisci 2 Numeri interi:");
		int N1,N2;
		Scanner in=new Scanner(System.in);
		N1=in.nextInt();
		N2=in.nextInt();
		in.close();
		if (primo(N1) && primo(N2) && valoreAssoluto(N1-N2)==2)
			System.out.print("primi gemelli");
		else
			System.out.print("Non sono primi gemelli");
		
	}

}
