package deneme;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {

        /* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
           tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program */

        double tutar,KDV1=0.18,KDV2=0.08;

        System.out.print("Urunun Tutarini Giriniz:");

        Scanner input = new Scanner(System.in);
        tutar= input.nextDouble();

        System.out.println("Urunun KDV'siz Fiyati:" + tutar);

        double toplamKDV = (tutar < 1000)? tutar*KDV1 : tutar*KDV2;
        double toplamTutar= tutar+ toplamKDV;

        System.out.println("Urunun KDV'li hali:" +  toplamTutar);


    }
}
