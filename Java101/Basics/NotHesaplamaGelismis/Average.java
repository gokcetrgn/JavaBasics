package NotHesaplamaGelismis;

import java.util.Scanner;

public class Average {
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

        int toplam = 0;

        if(0<= mathLesson && mathLesson<= 100 ){
            toplam += mathLesson;
        }
        if(0<= turkishLesson && turkishLesson<= 100 ){
            toplam += turkishLesson;
        }
        if(0<= physLesson && physLesson <= 100 ){
            toplam += physLesson;
        }
        if(0<= chemistryLesson && chemistryLesson<= 100 ){
            toplam += chemistryLesson;
        }
        if(0<= musicLesson && musicLesson <= 100 ){
            toplam += musicLesson;
        }
        if(0<= historyLesson && historyLesson<= 100 ){
            toplam += historyLesson;
        }
        
        double average = toplam / 6;

        System.out.println("Ortalamaniz: " + average);
    
        scanner.close();
    }
}
