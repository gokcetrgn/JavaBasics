package MinefieldGame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int satir;
    int sutun;
    char[][] dizi;
    String[][] mayinKonumu;

    public MineSweeper(int satir, int sutun) {
        satir = 3;
        sutun = 3;

    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Satir girin: ");
        int satir = scanner.nextInt();

        System.out.println("Sütun girin: ");
        int sutun = scanner.nextInt();

        mayinTarlasiGoster(satir, sutun);

        mayinEkle(satir, sutun);

        mayinliTarla(satir, sutun);
        
        
        System.out.println("Mayin tarlasina hos geldin!");

        System.out.println("------------------");

        int donguSayisi = (satir * sutun) - ((satir * sutun) / 4);

        while (0 < donguSayisi) {
            int toplamMayin = 0;
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    System.out.print(mayinKonumu[i][j] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("Satir giriniz: ");
            int sorgulananSatir = scanner.nextInt() - 1;

            System.out.println("Sutun giriniz: ");
            int sorgulananSutun = scanner.nextInt() - 1; // kullanicinin girdiği degerler 1 den başlayacağı icin -1

            if ((sorgulananSatir <= satir) && (sorgulananSutun <= sutun) || (sorgulananSatir > 0)
                    || (sorgulananSutun > 0)) {

                if (dizi[sorgulananSatir][sorgulananSutun] == '*') {
                    System.out.println("Mayin!!!!!");
                    break;
                } else {
                    if (sorgulananSatir - 1 >= 0 && sorgulananSutun - 1 >= 0) {
                        if (mayinKonumu[sorgulananSatir - 1][sorgulananSutun - 1] == "*") {
                            toplamMayin++;
                        }
                        if (sorgulananSatir - 1 >= 0) {
                            if (mayinKonumu[sorgulananSatir - 1][sorgulananSutun - 1] == "*") {
                                toplamMayin++;
                            }
                        }
                        if(sorgulananSutun - 1 >= 0){
                            if(mayinKonumu[sorgulananSatir - 1][sorgulananSutun - 1] == "*")
                            {
                                toplamMayin++;
                            }
                        }
                        if(sorgulananSatir - 1 >= 0 && sorgulananSutun + 1 < sutun)
                        {
                            if(mayinKonumu[sorgulananSatir - 1][sorgulananSutun + 1] == "*"){
                                toplamMayin++;
                            }
                        }
                        if(sorgulananSatir +1 < satir  && sorgulananSutun -1 >=0)
                        {
                            if(mayinKonumu[sorgulananSatir + 1][sorgulananSutun - 1] == "*")
                            {
                                toplamMayin++;
                            }
                        }
                        if(sorgulananSatir +1 < satir)
                        {
                            if(mayinKonumu[sorgulananSatir + 1 ][sorgulananSutun] == "*")
                            {
                                toplamMayin++;
                            }
                        }
                        if(sorgulananSutun + 1 < sutun){
                            if(mayinKonumu[sorgulananSatir][sorgulananSutun + 1] == "*")
                            {
                                toplamMayin++;
                            }
                        }
                        if(sorgulananSatir + 1 < satir && sorgulananSutun + 1 < sutun)
                        {
                            if(mayinKonumu[sorgulananSatir +1 ][sorgulananSutun + 1] == "*"){
                                toplamMayin++;
                            }
                        }
                        mayinKonumu[sorgulananSatir][sorgulananSutun] = String.valueOf(toplamMayin);
                    }
                }
            }
            else{
                System.out.println("Gecersiz satir/sütun verdiniz! Tekrar deneyin.");
                continue;
            }
            System.out.println("------------------------------");
            donguSayisi--;
            if(donguSayisi == 0){
                System.out.println("Kazandin, tebrikler !!!!");
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sutun; j++) {
                        System.out.print(mayinKonumu[i][j] + " ");
                    }
                    System.out.print("\n");
                }
            }
        }
    }

    void mayinTarlasiGoster(int satir, int sutun) {
        dizi = new char[satir][sutun];
        mayinKonumu = new String[satir][sutun];
        for (int i=0;i<satir;i++){
            for (int j=0;j<sutun;j++){
                dizi[i][j]='-';
                mayinKonumu[i][j]="-";

            }
        }
    }

    void mayinEkle(int satir, int sutun) {

        int elemanSayisi = satir * sutun;

        int mayinSayisi = elemanSayisi / 4;

        int i = 0;
        while (i < mayinSayisi) {
            Random rand = new Random();
            int mayinSatir = (int) rand.nextInt(satir);
            int mayinSutun = (int) rand.nextInt(sutun);

            if (dizi[mayinSatir][mayinSutun] == '*') {
                i++;
            } else {
                dizi[mayinSatir][mayinSutun] = '*';
            }

        }
    }

    void mayinliTarla(int satir, int sutun) {
        System.out.println("Mayinlarin Konumu");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(dizi[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("=======================");
    }
}
