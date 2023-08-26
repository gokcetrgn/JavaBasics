package Fibonacci;

import java.util.Scanner;

public class FibonacciExamp {
    public static void main(String[] args) {
        int ilkSayi = 1;
        int ikinciSayi = 1;
        int temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayisini girin: ");
        int basamakSayisi = scanner.nextInt();

        int i = 0;
        // 1 1 2 3 5 8 13 21
        System.out.print(ilkSayi +" " + ikinciSayi + " ");

        while(i<basamakSayisi){
            temp = ikinciSayi + ilkSayi;
            System.out.print(temp + " ");
            ilkSayi = ikinciSayi;
            ikinciSayi = temp;
            i++;
        }
        scanner.close();
    }
}
