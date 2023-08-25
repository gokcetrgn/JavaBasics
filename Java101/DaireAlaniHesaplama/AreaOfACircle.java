package DaireAlaniHesaplama;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        final double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yaricapi girin:");

        double r = scanner.nextDouble();

        System.out.println("Merkez aciyi girin:");

        double aci = scanner.nextDouble();

        double alan =  ((pi * (r*r) * aci) / 360);

        System.out.println(alan);
    }
}
