package GCD;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayiyi Giriniz :");
        int sayiBir = scanner.nextInt();

        System.out.println("İkinci sayiyi Giriniz :");
        int sayiİki = scanner.nextInt();

        int ebob = 0, ekok;
        for(int i = 1; i<=sayiBir && i<= sayiİki; i++){
            if(sayiBir % i == 0 && sayiİki % i == 0){
                ebob = i;
            }
        }
        ekok = (sayiBir * sayiİki) / ebob;

        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    
        scanner.close();
    }
}
