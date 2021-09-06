
public class FunzioniDoppioQuadruplo {

	public static int doppio (int x) {
		// errore intenzionale, verificare lo "stack"  (main-quadruplo-doppio)
		return x * 2 / 0;
	}
	
	public static int quadruplo (int x) {
		return doppio(x) + doppio(x);
	}
	
	public static void main(String[] args) {
		
		int a = 4;
		
		System.out.println(  quadruplo (a)  );

	}

}
