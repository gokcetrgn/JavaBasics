package Methots.GuessTheNumber;

import java.util.Arrays;
import java.util.Scanner;


public class GuesstheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theNumber = (int) (Math.random() * 100);

        int guessNumber = 0;

        int[] wrongNumbers = new int[5];

        boolean isWin = false;
        boolean isWrong = false; 

        while(guessNumber <= 5){
            if(guessNumber == 5){
                System.out.println("Tahmin hakkiniz doldu.");
                break;
            }
            System.out.print("0-100 arasinda bir sayi giriniz: ");
            int guess = scanner.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("Lütfen 0-100 arasinda bir değer giriniz.");
                if (isWrong) {
                    guessNumber++;
                    System.out.println("Çok fazla hatali giriş yaptiniz. Kalan hak : " + (5 - guessNumber));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatali girişinizde hakkinizdan düşülecektir.");
                }
                continue;
            }
            if(guess == theNumber){
                isWin = true;
                System.out.println("Kazandiniz!!!");
                break;
            }else{
                System.out.println("Hatali bir sayi girdiniz !");
                if (guess > theNumber) {
                    System.out.println(guess + " sayisi, gizli sayidan büyüktür.");
                } else {
                    System.out.println(guess + " sayisi, gizli sayidan küçüktür.");
                }

                wrongNumbers[guessNumber++] = guess;
                System.out.println("Kalan hakki : " + (5 - guessNumber));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrongNumbers));
                System.out.println("Asil sayi: " + theNumber);
            }
        }
        scanner.close();
    }
}
