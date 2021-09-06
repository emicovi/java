
public class ArrayComeParametri {

	public static int f ( int a, int b) {
		
		int res = a + b;
		
		// modificare a e b non avrà effetto sui parametri "attuali" passati dal chiamante
		a = 100;
		b = 1000;
		
		return res; 
		
	}
	
	
	public static int contaPari1 (int [] a ) {
		int conta = 0;
		
		// scorrere l'array col "for each"
		for (int elem : a) {
			if (elem % 2 == 0)
				conta++;
		}
		return conta;
	}

	public static int contaPari2 (int [] a ) {
		int conta = 0;
		
		// scorrere l'array con un intero come iteratore
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				conta++;
		}
		
		// modificare l'array avrà un effetto visibile dal chiamante
		a[0] = 10000;
				
		return conta;
	}
	

	public static void main(String[] args) {
		
		int a = 4;
		int b = 8;
		
		System.out.println(" a e b PRIMA dell'invocazione: " + a + " " + b);
		
		System.out.println( f (a, b) );
		
		System.out.println(" a e b DOPO     l'invocazione: " + a + " " + b);
		
		int [] pippo = {1,2,3,4,5,6,7,8};

		
		System.out.print("array PRIMA dell'invocazione  : ");
		for (int elem : pippo) 
			System.out.print( elem + " ");
		System.out.println();
		
		
		System.out.println( contaPari2(pippo) );
		
		
		System.out.print("array DOPO l'invocazione    :");
		for (int elem : pippo) 
			System.out.print( elem + " ");
		System.out.println();

	}

}
