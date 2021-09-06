package confrontanumeri;

import java.util.Scanner;

public class Maggiore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A,B; 
		A=in.nextInt(); 
		B=in.nextInt();
		
		if (A>B) {
	        System.out.println("Il numero Maggiore è "+A);
		}
		else if (A==B) {
				System.out.println("Sono uguali");
			}
		else   {
			System.out.println("Il numero maggiore è "+B);
		}
	
		
		System.out.println("Ciao");
		
		}

}
