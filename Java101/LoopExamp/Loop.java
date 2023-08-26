package LoopExamp;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dongu sayisini girin: ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        for(int i = 0; i<sayi; i++){
            if(i % 3 == 0 && i % 4 == 0 ){
                toplam += i;
            }
        }
        System.out.println("Toplam: " + toplam);
        scanner.close();
    }
}
