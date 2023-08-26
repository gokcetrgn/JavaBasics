package ArtikYilBulma;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yil girin: ");
        int yil = scanner.nextInt();

        if(yil % 100 == 0 && yil % 400 == 0){
            System.out.println(yil + " bir artik yildir.");
        }
        if(yil % 4 == 0){
            System.out.println(yil + " bir artik yildir.");
        }
        else{
            System.out.println(yil +" bir artik yil degildir.");
        }

        scanner.close();
    }
}
