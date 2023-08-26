package Factorial;

import java.util.Scanner;

public class FFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Bir sayi giriniz: ");
         int sayi = scanner.nextInt();
         int carpim = 1;

         for(int i = 1; i<= sayi; i++){
            carpim *=i;
         }
         System.out.println("Faktoriyel: " + carpim);
         scanner.close();
    }
}
