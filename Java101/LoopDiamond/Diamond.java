package LoopDiamond;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz :");
        int sayi = scanner.nextInt();


        for(int i = 1; i<=sayi; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = sayi; k >= (2 * i + 1); k--) {
                System.out.print("*");

            }
            System.out.println();
        }
        scanner.close();
    }
}
