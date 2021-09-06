import java.util.Scanner;

public class Scomponi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduci un numero intero");
		N=in.nextInt();
		
		System.out.println("Il numero con le cifre invertite è:");
		
		while(N!=0)
		{
			System.out.print(N%10);
			N=N/10; 
		}
		in.close();

	}

}
