package Methots.Palindrom;

import java.util.Scanner;

public class IsAPalindrom {

    static boolean isPolindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == reverseNumber){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sorgulanacak sayi: ");
        int sayi = scanner.nextInt();

        if(isPolindrom(sayi)){
            System.out.println(sayi +" is a palindrom  number");
        }else{
            System.out.println("Not a palindrom number");
        }
        scanner.close();
    }
}
