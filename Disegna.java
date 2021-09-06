import java.util.Scanner;

public class Disegna {

	public static void stampaCaratteri(int X, char C) {
        
        for(int contatore=0; contatore<X; contatore++  )
        {
        	System.out.print(C);
        	
        }
        
    }
	
    public static void main(String[] args) {
        // metodo che dato un numero X ed un carattere C stampa una linea fatta da X volte C 
        System.out.println("Inserisci un numero ed un carattere:");
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        char C = scanner.next().charAt(0);
        scanner.close();
        
        stampaCaratteri(X, C);
    }
}
