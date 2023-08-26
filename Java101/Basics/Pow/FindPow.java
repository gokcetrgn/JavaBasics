package Pow;

import java.util.Scanner;

public class FindPow {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Bir sayi giriniz: ");
         int sayi = scanner.nextInt();

         System.out.println("Dordun katlari:");
         for(int i = 1; i<sayi; i*=4){
            System.out.println(i);
         }
         System.out.println("Besin katlari:");
         for(int i = 1; i<sayi; i*=5){
            System.out.println(i);
         }
         scanner.close();
    }
}
