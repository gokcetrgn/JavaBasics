package ZodiacSign;

import java.util.Scanner;

public class ZodiaCSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dogum gununuzu yazin: ");
        int dogumGunu = scanner.nextInt();

        System.out.println("Dogum ayinizi sayi olarak girin: ");
        int dogumAyi = scanner.nextInt();

        if(dogumAyi == 1){
            if(dogumGunu<=21){
                System.out.println("Balik");
            }else{
                System.out.println("Kova");
            }
        }
        if(dogumAyi == 2){
            if(dogumGunu<=21){
                System.out.println("Oglak");
            }else{
                System.out.println("Kova");
            }
        }
        if(dogumAyi == 2){
            if(dogumGunu<=19){
                System.out.println("Kova");
            }else{
                System.out.println("Balik");
            }
        }
        if(dogumAyi == 3){
            if(dogumGunu<=20){
                System.out.println("Balik");
            }else{
                System.out.println("Koc");
            }
        }
        if(dogumAyi == 4){
            if(dogumGunu<=20){
                System.out.println("Koc");
            }else{
                System.out.println("Boga");
            }
        }
        if(dogumAyi == 5){
            if(dogumGunu<=21){
                System.out.println("Boga");
            }else{
                System.out.println("Ikizler");
            }
        }
        if(dogumAyi == 6){
            if(dogumGunu<=23){
                System.out.println("Ikizler");
            }else{
                System.out.println("Yengec");
            }
        }
        if(dogumAyi == 7){
            if(dogumGunu<=23){
                System.out.println("Yengec");
            }else{
                System.out.println("Aslan");
            }
        }
        if(dogumAyi == 8){
            if(dogumGunu<=23){
                System.out.println("Aslan");
            }else{
                System.out.println("Basak");
            }
        }
        if(dogumAyi == 9){
            if(dogumGunu<=23){
                System.out.println("Basak");
            }else{
                System.out.println("Terazi");
            }
        }
        if(dogumAyi == 10){
            if(dogumGunu<=23){
                System.out.println("Terazi");
            }else{
                System.out.println("Akrep");
            }
        }
        if(dogumAyi == 11){
            if(dogumGunu<=21){
                System.out.println("Akrep");
            }else{
                System.out.println("Yay");
            }
        }
        if(dogumAyi == 12){
            if(dogumGunu<=21){
                System.out.println("Yay");
            }else{
                System.out.println("Oglak");
            }
        }
        scanner.close();
    }
}
