package ColumnSum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int temp = sayi;
        while(temp != 0){
            toplam += (temp % 10);
            temp = temp / 10;
        }
        System.out.println("Basamak toplami: "+ toplam);
        scanner.close();
    }
}
