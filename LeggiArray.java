import java.util.*;

public class LeggiArray {
	
	
	public static void leggi (int [] v, Scanner in) {
		for (int i = 0; i < v.length; i++)
			v[i] = in.nextInt();
	}

	public static void main ( String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		int [] a = new int [5];
		
		for (int i = 0; i<a.length; i++) 
			System.out.print( a[i] + " ");
		System.out.println();
		
		leggi (a,in);
		
		for (int i = 0; i<a.length; i++) 
			System.out.print( a[i] + " ");
		System.out.println();
		
	}
}

