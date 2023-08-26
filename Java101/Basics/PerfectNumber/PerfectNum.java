package PerfectNumber;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sorgulanacak sayiyi giriniz: ");
        int girilenSayi = scanner.nextInt();

        int toplam = 0;
        for(int i = 1; i<girilenSayi; i++){
            if(girilenSayi % i == 0){
                toplam += i;
            }
        }
        if (toplam == girilenSayi)
        {
          System.out.println(girilenSayi + " mukemmel sayidir.");  
        }else{
            System.out.println(girilenSayi + " mukemmel degildir.");
        }
        scanner.close();

    }
}
