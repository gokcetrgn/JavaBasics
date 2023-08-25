package AlanHesaplama;

import java.util.Scanner;

public class AlanExamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kenarlari giriniz:");

        int birinciKenar = scanner.nextInt();

        int ikinciKenar = scanner.nextInt();

        int ucuncuKenar = scanner.nextInt();

    
        double u =  (birinciKenar + ikinciKenar + ucuncuKenar) / 2;

        double cevre = 2 * u;

        double alan;

        alan = Math.sqrt(u*(u-birinciKenar)*(u-ikinciKenar)*(u-ucuncuKenar));

        System.out.println("Cevre: " + cevre);
        System.out.println("Alan: "+ alan);
        
        scanner.close();
    }
}
