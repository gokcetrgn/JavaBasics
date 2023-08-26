package UcakBileti;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("KM Girin: ");
        double km = scanner.nextDouble();

        System.out.println("Gidiş türünü seçin: 1.Tek Yön 2.Çift Yön");
        int yolculukTipi = scanner.nextInt();

        System.out.println("Yasiniz nedir?: ");
        int yas = scanner.nextInt();

        double normalTutar = km * 0.10;
        double yasIndirimi, indirimliTutar,odenecek;

        if (km > 0 && yolculukTipi == 1 || yolculukTipi == 2){
            if(yas<12){
            yasIndirimi = normalTutar * 0.5;
            indirimliTutar = normalTutar - yasIndirimi;
            odenecek = indirimliTutar;
            if(yolculukTipi == 2){
            double yolculukTipiIndirimi = indirimliTutar * 0.20;
            odenecek = 2 * (indirimliTutar - yolculukTipiIndirimi);

        }
            
        }else if(12<=yas && yas<=24){
            yasIndirimi = normalTutar * 0.1;
            indirimliTutar = normalTutar - yasIndirimi;
            odenecek = indirimliTutar;
            if(yolculukTipi == 2){
            double yolculukTipiIndirimi = indirimliTutar * 0.20;
             odenecek = 2 * (indirimliTutar - yolculukTipiIndirimi);

            }
        }else if(yas >= 65){
            yasIndirimi = normalTutar * 0.3;
            indirimliTutar = normalTutar - yasIndirimi;
            odenecek = indirimliTutar;
            if(yolculukTipi == 2){
            double yolculukTipiIndirimi = indirimliTutar * 0.20;
             odenecek = 2 * (indirimliTutar - yolculukTipiIndirimi);
            }
        }
        else{
            odenecek = normalTutar;
        }
        System.out.println("Odenecek tutar: " + odenecek);
        
        }else{
            System.out.println("Gecersiz islemler.");
        }
        scanner.close();
    }
}
