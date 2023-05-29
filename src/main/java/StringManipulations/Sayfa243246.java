package StringManipulations;

public class Sayfa243246 {
    public static void main(String[] args) {
     /* Ornek-1
        Sadece tek bir kelimeden olusan sehir isimleri için bir String degiskeni olusturun. Sehir
        Ismini, bas harfi büyük ve diger tüm karakterleri küçük harfler olacak sekilde konsolda yazdiriniz.
            Örnek:  mIAMI - Miami
                    miami - Miami
                    MIAMI - Miami
                    mIaMi - Miami vb.           */

        String sehirAdi = "mAlAtyA";
        String yeniSehir = sehirAdi.trim().toLowerCase();
        yeniSehir = yeniSehir.substring(0,1).toUpperCase()+yeniSehir.substring(1);

        System.out.println("Ornek-1: " + yeniSehir);//Malatya


        /* Ornek-2
            Kisi isimleri için 3 String degisken olusturunuz. Bosluk karakterleri hariç 3 isimdeki karakter sayısının
            toplamını yazdırınız.
            Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.       */
        String ilkisim      = "Benna Sozen";
        String ikinciisim   = "Irem Sozen";
        String sonisim      = "Zehra ve Fatima";

        Integer c1 = ilkisim.replaceAll("\\s","").length();
        Integer c2 = ikinciisim.replaceAll("\\s","").length();
        Integer c3 = sonisim.replaceAll("\\s","").length();

        System.out.println("Ornek-2: " +(c1+c2+c3));//32

        /* Ornek-3
        Bir String degiskeni olusturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
        Örnek: "Miami 33018!!!" ise konsolda 10 yazdırmanız gerekir.            */
        String ornek3 = "Miami 33019!!!!";
        Integer c4 = ornek3.trim().replaceAll("\\s","").replaceAll("\\p{Punct}","").length();

        System.out.println("Ornek-3: " + c4);//10

        /* Ornek-4
        Bir String degiskeni olusturunuz, String'deki rakam olmayan karakterlerin sayisini konsolda yazdiriniz.
        Ornek : "1a3Bcf4!..." ise konsolda 8 yazmalidir.        */
        String ornek4 = "1a3Bcf4!...";
        Integer sonuc4 = ornek4.trim().replaceAll("[0-9]","").length();

        System.out.println("Ornek-4: " +sonuc4);//8

        /* Ornek-5
        Bir String degiskeni olusturunuz ve String degiskenin konsolda bosluk olmayan son karakteri yazdiriniz.    */

        String ornek5 = "Zehra Sare";

        int sonuc5 = ornek5.trim().length()-1;
        String yenisonuc5 = ornek5.substring(sonuc5,sonuc5+1);
        System.out.println("Ornek-5: " + yenisonuc5);//e


        /* Ornek-6
        Bir String degiskeni olusturunuz ve String degiskeninin ilk ve son karakterlerinin,
        ASCII degerlerini toplamini yazdiriniz.                                                             */

        String ornek6 = "Kristiansand";

        int ilkharf = ornek6.trim().charAt(0);
        int sonharf = ornek6.trim().length()-1;

        System.out.println("Ornek-6: " + (ilkharf+sonharf));//86

        /* Ornek-7
        Bir String degiskeni olusturunuz ve ilk karakterleri disindaki tum karakterleri konsolda yazdiriniz.        */

        String ornek7 = "canim";

        String sonuc7 = ornek7.substring(1);
        System.out.println("Ornek-7: " + sonuc7);//anim

        /*Ornek-8
        Bir String degiskeni olusturunuz ve son karakterleri disindaki tum karakterleri konsola
        buyuk harfle yazdiriniz.                                                                                    */

        String ornek8 = "java";
        Integer sonharf8 = ornek8.length()-1;
        String yeniornk8 = ornek8.substring(0,sonharf8).toUpperCase();  //"sonharf8" yukarida Integer degerini aliyoruz.
                        // Cunku nerede bitecegini index icinde soylememiz gerekiyor bunu da Integer ile soylemis olduk.
        System.out.println("Ornek-8: " + yeniornk8);//JAV

        /*Ornek-9
        Bir String degiskeni olusturunuz ilk ve son karakterleri disindaki tum karakterleri konsola
        buyuk harfle yazdiriniz.                                                                                    */

        String ornek9 = "Texsas";
        Integer sonharf9 = ornek9.length()-1;
        String yeniornek9  = ornek9.substring(1,sonharf9).toUpperCase();
        System.out.println("Ornek-9: " + yeniornek9);//EXSA









    }//main
}//class
