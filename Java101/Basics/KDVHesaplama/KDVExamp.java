package KDVHesaplama;

import java.util.Scanner;

public class KDVExamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Para degeri girin:");

        double value = scanner.nextDouble();

        double money = value < 1000 ? (value += (value * 0.18)) :  (value += (value * 0.08));

        System.out.println(money);;

        scanner.close();
    }
}
