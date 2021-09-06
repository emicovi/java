import java.util.Scanner;

public class Disegna {

	public static void DisegnaRiga(int X) {
        
        for(int contatore=0; contatore<X; contatore++  )
        {
        	System.out.print(X);	
        }
        System.out.println();
    }

	public static void DisegnaTabella(int X) {
        
        for(int contatore=0; contatore<X; contatore++  )
        {
        	DisegnaRiga(X);
        }
        
    }

    public static void main(String[] args) {
        // metodo che dato un numero X ed un carattere C stampa una linea fatta da X volte C 
        System.out.println("Inserisci un numero :");
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();
        
        DisegnaTabella(X);
    }
}
