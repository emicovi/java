import java.util.Scanner;

public class DisegnaQuadrato {
    public static void disegnaquadrato(int L)
    {
    	for(int j =0; j<L; j++)
    	{
    	for(int i=0; i<L; i++)
    		System.out.print('*');
    	System.out.println("");
    	}
    }
	
    public static void disegnaquadratonumeri(int L)
    {
    	for(int j =0; j<L; j++)
    	{
    		for(int i=1; i<=L; i++)
    			System.out.print(i+" ");
    		System.out.println("");
    	}
    }

    public static void disegnaquadratonumeriINCR(int L)
    {
    	for(int j =0; j<L; j++)
    	{
    		for(int i=1+j; i<=L+j; i++)
    			System.out.print((i)+" ");
    		System.out.println("");
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int N;
     Scanner in = new Scanner(System.in);
     System.out.println("inserisci un numero positivo ");
     N=in.nextInt();
     
     disegnaquadrato(N);
     System.out.println("");
     disegnaquadratonumeri(N);
     System.out.println("");
     disegnaquadratonumeriINCR(N);
	}

}
