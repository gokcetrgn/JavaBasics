package VucutKitleIndeksi;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu girin:");
        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu girin:");
        double boy = scanner.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.println("Vucut kitle indeksiniz: " + bmi);

        scanner.close();

    }
}
