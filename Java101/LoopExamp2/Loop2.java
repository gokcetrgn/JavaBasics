package LoopExamp2;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do{
            System.out.print("Cift sayi girin: (Tek sayi girdiginizde dongu sona erer!) ");
            sayi = scanner.nextInt();
            if(sayi % 4 == 0){
                toplam += sayi;
        }
    }
        while(sayi % 2 == 0);
        System.out.println("Toplam " + toplam);
        scanner.close();
    }
}
