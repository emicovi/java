import java.util.Scanner;

public class Triangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int A,B,C;
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci i lati del triangolo");
        A=in.nextInt();    // 5
        B=in.nextInt();    // 5
        C=in.nextInt();   
        
        
        System.out.println(Double.SIZE);
        
        if (A==B && B==C) // VERA
        	System.out.println("Equilatero");
        else if (A==B || B==C|| A==C)
        	System.out.println("Isoscele");
        else
        	System.out.println("Scaleno");
        in.close();
        
	}

}
