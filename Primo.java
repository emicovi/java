import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		in.close();
		int d=2;
		boolean primo=true;
		while(d<N/2&&primo==true)
		{
			System.out.println("provo il divisore"+d);	
			if(N%d==0) 
			{
				System.out.print("ho trovato un divisore quindi non è primo3");
				primo=false;
			}
			d++;
		}
		if (primo==true)
			System.out.print("Il numero è primo");
		else
			System.out.print("Il numero non è primo");

	}

}
