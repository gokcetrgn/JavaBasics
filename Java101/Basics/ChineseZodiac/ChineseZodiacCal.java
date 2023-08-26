package ChineseZodiac;

import java.util.Scanner;

public class ChineseZodiacCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dogum yilinizi giriniz: ");
        int dogumYili = scanner.nextInt();

        int kalan = dogumYili % 12;

        switch(kalan){
            case 0:
            System.out.println("Maymun");
            break;
            case 1:
            System.out.println("Horoz");
            break;
            case 2:
            System.out.println("Köpek");
            break;
            case 3:
            System.out.println("Domuz");
            break;
            case 4:
            System.out.println("Fare");
            break;
            case 5:
            System.out.println("Öküz");
            break;
            case 6:
            System.out.println("Kaplan");
            break;
            case 7:
            System.out.println("Tavşan");
            break;
            case 8:
            System.out.println("Ejderha");
            break;
            case 9:
            System.out.println("Yilan");
            break;
            case 10:
            System.out.println("At");
            break;
            case 11:
            System.out.println("Koyun");
            break;
            default:
            break;
        }
        scanner.close();
    }
}
