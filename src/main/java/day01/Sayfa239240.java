package day01;

import java.util.Scanner;

public class Sayfa239240 {

    public static void main(String[] args) {

        //  Ornek-1:  Herhangi bir üç ogenin fiyatlarını double veri tipinde değişkenler olarak oluşturun ve
        //  fiyatların toplamını konsola yazdırın.
        double gomlek = 2500.79;
        double corap = 20.59;
        double kravat = 150.89;

        System.out.println("Ornek-1: " + (gomlek+corap+kravat));//2672.27

    //**************************************************************************************************************
        // Ornek-2: Herhangi bir üç öğe için float, long ve integer veri tiplerinde değişkenler oluşturun ve
        // bu değişkenlerin değerlerinin çarpımını konsola yazdırın.
        long a = 687646546540000L;
        int  b = 167866;
        float c = 12739.210983F;

        System.out.println("Ornek-2: "+ (a*b*c));

    //**************************************************************************************************************
        // Ornek-3: Basit faizi bulmak icin kod yaziniz.
        /* Basit Faiz Formülü:
            A = P * (1 + r * t)

            Burada:
            A: Son toplam miktar (ana para + faiz)
            P: Başlangıç ana para miktarı
            r: Faiz oranı (ondalık cinsinden ifade edilir)
            t: Faiz süresi (yıl cinsinden)                          */

        int p = 5000;         //Anapara
        double r = 0.02;      //Faiz miktari
        int t = 5;            //Faiz suresi
        double a3 = p*(1+r*t);

        System.out.println("Ornek-3: "+a3);
    //**************************************************************************************************************
        // Ornek-4: Bir String ve iki long veri tipinde değişken oluşturun ve bu long değişkenlerin toplamını ve
        // çarpımını String ile yazdırın.

        String first    = "Araba";
        long second     = 9L;
        long third      = 123L;

        System.out.println("Ornek-4.1: "+first+(second*third));
        System.out.println("Ornek-4.2: "+first+(second+third));
    //**************************************************************************************************************
        // Ornek-5: Farklı değerlere sahip iki boolean veri tipinde değişken oluşturun ve
        // bu değerleri iki ardisik deger arasinda bosluk birakacak sekilde aynı satırda yazdırın.

        boolean birinci = false;
        boolean ikinci  = true;
        System.out.println("Ornek-5: " +birinci+" "+ikinci);

    //**************************************************************************************************************
         // Ornek-6: 3 oge (kitap,defter ve laptop) fiyati icin long data tipinde degislenler olusturunuz.
         // Konsolda 2 kitap, 4defter ve 3 laptop icin toplam fiyati yazdiriniz.

        long kitap  = 231L;
        long defter = 2L;
        long laptop = 34L;
        long toplam = 2*kitap+4*defter+3*laptop;

        System.out.println("Ornek-6: "+toplam);

        //Ornek-7: Iki tamsayıyı degistirmek için bir kod yazınız.

        Scanner ornek7 = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz..");
        double ab = ornek7.nextDouble();
        System.out.println("1. Sayi: "+ab);

        double ac = ornek7.nextDouble();
        System.out.println("2.Sayi : "+ac);

        double temp = ab;
        ab = ac;
        ac = temp;
        System.out.println("Ornek-7: "+"1.Sayi: "+ab+"---"+"2.Sayi: "+ac);











































    }//main
}//class
