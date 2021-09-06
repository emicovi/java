package bisestile;

import java.util.Scanner;

public class Bisestile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Inserisci l'anno");
		
		int anno=scanner.nextInt();
		
		if( anno%4==0 && anno%100!=0 || anno%400==0 ) 
			
			System.out.println("BISESTILE");
		else
			System.out.println("NON BISESTILE");
		
		scanner.close();
	 
	}

}
