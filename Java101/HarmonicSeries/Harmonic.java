package HarmonicSeries;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sayi girin: ");
        double sayi = scanner.nextDouble();

        double harmonic = 0;
        for(double i =1; i<=sayi; i++){
            harmonic += (1 / i);
        }
        System.out.println("Harmonik sayi: "+harmonic);
        scanner.close();
    }
}
