package ManavKasaOdevi;

import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kelime = "kaç kilo aldindi?:";

        System.out.println("Armuttan " + kelime);
        double armutKg = 2.14;
        int alinanArmut = scanner.nextInt();

        System.out.println("Elmadan " + kelime);
        double elmaKg = 3.67;
        int alinanElma = scanner.nextInt();

        System.out.println("Domatesten " + kelime);
        double domatesKg = 1.11;
        int alinanDomates = scanner.nextInt();

        System.out.println("Muzdan " + kelime);
        double muzKg = 0.95;
        int alinanMuz = scanner.nextInt();

        System.out.println("Patlicandan " + kelime);
        double patlicanKg = 5;
        int alinanPatlican = scanner.nextInt();

        double odenenTutar = armutKg * alinanArmut + elmaKg * alinanElma + domatesKg * alinanDomates + muzKg * alinanMuz + patlicanKg * alinanPatlican ;

        System.out.println(odenenTutar);

        scanner.close();
    }
}
