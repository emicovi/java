import java.util.*;

public class StampaTriangoloUtilePerNumeriTriangolari {
	
	public static void main(String[] args) {

		int n = 10;
		for (int i=0; i <= n; i++) {
			for (int h = 0; h < n-i; h++)
				System.out.print(" ");
			for (int j = 0; j < i;   j++)
				System.out.print(" *");
			System.out.println();
			
			
		}
		
	}
}