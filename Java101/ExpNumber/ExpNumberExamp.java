package ExpNumber;

import java.util.Scanner;

public class ExpNumberExamp {
    public static void main(String[] args) {
        int sayi, us;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        sayi = scanner.nextInt();

        System.out.print("Us girin: ");
        us = scanner.nextInt();

        int carpim =1;
        for(int i = 1; i<= us; i++ ){
            carpim *= sayi;
        }
        System.out.println("Elde edilen sayi: " + carpim);
        scanner.close();
    }

}
