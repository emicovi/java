package provina;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		// TODO Auto-generated method stub
		int base=in.nextInt(); 
		int altezza=in.nextInt(); //inizializzazione di una variabile
		
		System.out.println("L'area del rettangolo di base "+ base +" e altezza "+altezza+" è " + (base*altezza));
		in.close();
	}

	
	
}

