import java.util.Scanner;

public class StampaScarti {

	public static int leggi(int x[],Scanner in)
	{
		System.out.print("Quanti elementi vuoi confrontare?");
		int a=in.nextInt();
		for(int i=0;i<a;i++)
			x[i]=in.nextInt();
		return a;
	}
	public static int massimo(int a[], int dim)
	{
		int max=a[0];
		
		for(int i=1; i<dim;i++)
			if(max<a[i])
				max=a[i];
		return max;
		
	}
	
	public static double media(int a[], int dim)
	{
		int somma=0;
		for (int i=0; i< dim;i++)
		{
			somma+=a[i];
		}
		return (double)(somma)/dim;	
	}
	
	public static void stampaScarti(int a[], int max, int dim)
	{
		for (int i=0; i< dim;i++)
		{
			System.out.println(a[i]+" - "+(max-a[i]));
				
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] =new int[366];
		Scanner in = new Scanner(System.in);		
		int dim=leggi(a,in);
		int max=massimo(a,dim);
		System.out.println(max);
		System.out.println(media(a,dim));
		stampaScarti(a,max,dim);
		in.close();
		}
	
	
}
