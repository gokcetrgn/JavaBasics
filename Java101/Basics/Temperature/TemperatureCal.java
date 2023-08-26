package Temperature;

import java.util.Scanner;

public class TemperatureCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sicaklik girin: ");
        int temp = scanner.nextInt();

        if(temp<5){
            System.out.println("KAYAK");
        }else if(5<= temp && temp < 15){
            System.out.println("SINEMA");
        }else if(15<= temp && temp<25){
            System.out.println("PIKNIK");
        }else if(temp>=25){
            System.out.println("YUZME");    
        }
        scanner.close();
    }
}
