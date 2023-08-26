package Combination;

import java.util.Scanner;

public class FCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Bir sayi giriniz: ");
         int n = scanner.nextInt();

         System.out.println("r elemanini giriniz: ");
         int r = scanner.nextInt();

        int nCarpim = 1;
        for(int i = 1; i<= n; i++){
            nCarpim *=i;
         }
        int rCarpim =1;
        for(int i = 1; i<= r; i++){
            rCarpim *=i;
        }
        int nrCarpim =1;
        for(int i = 1; i<= (n-r); i++){
            nrCarpim *=i;
        }

         int combination = nCarpim / (rCarpim * nrCarpim );

         System.out.println("Kombinasyon: " + combination);
         scanner.close();
    }
}
