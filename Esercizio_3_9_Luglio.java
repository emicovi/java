import java.util.Scanner;

public class Esercizio_3 {

    public static void leggiInput(int arr[], Scanner scanner) {
        for (int i=0; i<arr.length;i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public static int valoreMassimoMinoreDiN(int[] arr, double n) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++) {
            if(arr[i]>max && arr[i]<n) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double calcolaMedia(int[] arr) {
        int somma = 0;
        for (int i=0; i<arr.length;i++) {
            somma+=arr[i];
        }
        System.out.println("La media dei valori inseriti è : " + (double)(somma)/arr.length);
        return (double)(somma)/arr.length;
    }

    public static void main(String[] args) {
        /*
         * Scrivere un programma che presi da input N numeri ne calcoli la media M
         * e stampi il numero più grande tra quelli più piccoli di M.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire ?");
        int n = scanner.nextInt();
        System.out.println("Inserisci " + n + " numeri :");
        int numeri[] = new int[n];
        leggiInput(numeri, scanner);
        scanner.close();

        double media = calcolaMedia(numeri);
        int max = valoreMassimoMinoreDiN(numeri, media);
        System.out.println("Il valore massimo fra quelli minori della media è : " + max);


    }

}
