package Methots.RecursivePow;

import java.util.Scanner;

public class Powder {
    static int powder(int sayi, int üs){
        if(üs == 0){
            return 1;
        }
        return sayi * powder(sayi, üs-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi girin: ");
        int sayi = scanner.nextInt();

        System.out.println("Üs girin: ");
        int üs = scanner.nextInt();

        System.out.println("Elde edilen sayi: "+ powder(sayi, üs));
        
        scanner.close();
    }
}
