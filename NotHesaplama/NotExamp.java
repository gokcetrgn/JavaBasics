package NotHesaplama;

import java.util.Scanner;

public class NotExamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        int mathLesson = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        int physLesson = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        int chemistryLesson = scanner.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        int historyLesson = scanner.nextInt();

        System.out.print("Turkce notunuzu giriniz:");
        int turkishLesson = scanner.nextInt();

        System.out.print("Muzik notunuzu giriniz:");
        int musicLesson = scanner.nextInt();

        int averange = (mathLesson + physLesson + chemistryLesson + historyLesson + turkishLesson + musicLesson) / 6;

        String result = averange >= 60 ? "Gecti" : "Kaldi";

        System.out.println(result);
        
        scanner.close();
    }
}
