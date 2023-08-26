package MinMax;

import java.util.Scanner;

public class MinMaxF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kac sayi gireceksiniz?: ");
        int girilecekSayi = scanner.nextInt();

        int enBuyuk = 0, enKucuk = 0;
        for(int i = 1; i<=girilecekSayi; i++){
            System.out.print(i + ". sayiyi giriniz:");
            int sayi = scanner.nextInt();

            if (sayi >= enBuyuk){
                enBuyuk = sayi;
            }
            if(sayi<= enKucuk){
                enKucuk = sayi;
            }
        }
        System.out.println("En buyuk: " + enBuyuk);
        System.out.println("En kucuk: " + enKucuk);

        scanner.close();
    }
}
