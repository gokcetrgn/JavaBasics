package HesapMakinesi;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        int first = scanner.nextInt();

        System.out.println("Second number:");
        int second = scanner.nextInt();

        System.out.println("Which One? 1-Add 2-Substract 3-Multiple 4-Divide");
        int process = scanner.nextInt();

        switch (process){
            case 1: 
            System.out.println(first + second);
            break;
            case 2:
            System.out.println(first - second);
            break;
            case 3:
            System.out.println(first * second);
            break;
            case 4:
            System.out.println(first / second);
            break;
            default:
            System.out.println("Invalid process");
            break;
        }
        scanner.close();
    }
}
