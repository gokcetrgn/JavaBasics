package TaksimetreHesaplama;

import java.util.Scanner;

public class TaximeterExamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç km  gittiğinizi girin: ");

        int km = scanner.nextInt();

        int acilisUcreti = 10;

        int min = 20;

        double taximetre = acilisUcreti + (km * 2.20);

        double tutar = taximetre >= 20 ? taximetre : min;

        System.out.println("Tutar:" + tutar);

        scanner.close();

    }
}
