package ATM;

import java.util.Scanner;

public class Atm {
 public static void main(String[] args) {
    String userName,password;
        Scanner scanner=new Scanner(System.in);
        int right=3;
        int select;
        int balance=1500;



        while(right>0){
        System.out.print("Kullanici Adiniz :");
        userName=scanner.nextLine();
        System.out.print("Parolaniz : ");
        password=scanner.nextLine();
        if (userName.equals("Patika")&& password.equals("dev123")){
            System.out.println("Merhaba, Kodluyoruz Bankasina Hoşgeldiniz.");
            do {
                System.out.println("1-Para yatirma\n"+ "2-Para Çekme\n"+ "3-Bakiye Sorgula\n"+ "4-Cikis Yap");
                System.out.print("Lütfen yapmak isteğiniz işlemi seçiniz.");
                select=scanner.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Para miktari:");
                        int price=scanner.nextInt();
                        balance +=price;
                    break;
                    case 2:
                        System.out.print("Para miktari:");
                        int pric=scanner.nextInt();
                          if (pric>balance){
                            System.out.println("Bakiye yetersiz.");
                           }else {
                            balance -= pric;
                           }
                    break;
                    case 3:
                        System.out.println("Bakiyeniz: "+balance);
                    break;
                }
            }while (select !=4);
            System.out.println("Tekrar görüşmek üzere.");
            break;
        }else{
            right--;
            System.out.println( "Hatali kullanici adi veya şifre. Tekrar deneyiniz.");
            if(right==0){
                System.out.println("hesabiniz bloke olmuştur lütfen banka ile iletişime geçiniz.");

            }else{
                System.out.println("Kalan Hakkiniz:"+right);
                }
            }
        }
        scanner.close();
     }   
}
