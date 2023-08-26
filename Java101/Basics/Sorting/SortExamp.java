package Sorting;

import java.util.Scanner;

public class SortExamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uc sayi girin: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        String isaret = "<";

        if(numberTwo < numberOne && numberTwo < numberThree){
            if(numberOne > numberThree){
                System.out.println(numberTwo + isaret + numberThree + isaret + numberOne);
            }else{
                System.out.println(numberTwo + isaret + numberOne + isaret + numberThree);
            }
        }
        else if(numberThree < numberOne && numberThree < numberTwo){
            if(numberOne > numberTwo){
                System.out.println(numberThree + isaret + numberTwo + isaret + numberOne);
            }else{
                System.out.println(numberThree + isaret + numberTwo + isaret + numberOne);
            }

        }
        else{
            if(numberTwo > numberThree){
                System.out.println(numberOne + isaret + numberThree + isaret + numberTwo);
            }else{
                System.out.println(numberOne + isaret + numberTwo + isaret + numberThree);
            }
        }
        scanner.close();
    }
}
