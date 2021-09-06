package ferrovia;

import java.util.Scanner;

/*Su una linea ferroviaria, rispetto alla tariffa piena, gli utenti pensionati usufruiscono di uno sconto del 10%,
gli studenti del 15% e i disoccupati del 25%. Scrivere un programma JAVA che, letti da input il costo di un
biglietto (un valore reale) e la condizione di sconto dell'utente (0 per nessuno sconto, 1 per sconto
pensionati, 2 per sconto studenti e 3 per sconto disoccupati) visualizzi l'importo da pagare.

ESEMPI:
- Se il costo del biglietto fosse 330 e la condizione di sconto fosse 1 il programma stamperebbe 297
- Se il costo del biglietto fosse 122 e la condizione di sconto fosse 3 il programma stamperebbe 91.5
- Se il costo del biglietto fosse 12.5 e la condizione di sconto fosse 3 il programma stamperebbe
9.375
- Se il costo del biglietto fosse 12.5 e la condizione di sconto fosse 0 il programma stamperebbe 12.5
*/
public class Ferrovia {

	public static void main(String[] args) {

		   double costo; int sconto;
		   
           System.out.println("Introduci il valore del biglietto e lo sconto (0 per nessuno sconto, 1 per sconto\r\n" + 
           		"pensionati, 2 per sconto studenti e 3 per sconto disoccupati)");
		   Scanner in=new Scanner(System.in);
		   costo=in.nextDouble();
		   sconto=in.nextInt();
		   double prezzoScontato=0.0;
		   switch(sconto)
		   {
		      case 0:
                  prezzoScontato =costo; 
		    	  break; 
		      case 1:
		         prezzoScontato =costo-(costo*10)/100;
		         break;
		      case 2:
		    	  prezzoScontato = costo-(costo*15)/100; 
		         break;
		      case 3:
		    	  prezzoScontato= costo-(costo*25)/100;
		         break;  
		   }
		   System.out.println("Il costo finale è "+ prezzoScontato);

	}

}
