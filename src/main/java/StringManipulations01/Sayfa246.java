package StringManipulations01;

public class Sayfa246 {
    public static void main(String[] args) {

        /* Ornek-10: Bir String'in ortadaki herhangi bir konumda yalnızca tek bir bosluk karakteri olup
                     olmadıgını kontrol etmek için kod yazınız.

        Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘ Ali Can ’ için konsolda false yazmalıdır.
        ‘Ali Can’ için konsolda true yazmalıdır.                                 */

        String s = "Irem Sozen";
        String kesilmis = s.trim();

        String bosluksuz = kesilmis.replaceAll("\\s","");
        boolean sonuc = kesilmis.length()-bosluksuz.length()==1;
        System.out.println("Ornek-10: "+ sonuc);

        /* Ornek-11: Bir String’in basında ve sonunda bosluk karakteri olup olmadıgını kontrol etmek için kod yazınız.
                     Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır.
                     ‘Ali’ için kodunuz konsolda true yazmalıdır.                      */

        String t = "Yolcudur Abbas";
        String yenit = t.trim();
        boolean sonuc1 = t.equals(yenit);

        System.out.println("Ornek-11: " +sonuc1);

        /* Ornek-12: Asagıdaki kosullar için bir parolanın geçerli olup olmadıgını kontrol etmek için kod yazınız;
                     Sifre bosluk karakterinden farklı olacak sekilde en az 8 karakter içermelidir. Sifrede en az 1
                     sembol olmalıdır.

            Örnek:  'A2b!' için kodunuz konsolda false yazdırmalıdır.
                    'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
                    '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
                    '! a b 3 k' kodunuz konsolda false yazdırmalıdır.
                    '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.           */


         String keyword = "!1a23b4?es";
         boolean karakterYeterliMi = keyword.replaceAll("\\s","").length()>=8;
         boolean enAzBirSembol = keyword.replaceAll("\\s","").
                                 replaceAll("[A-Za-z0-9]","").length()>0;

        System.out.println("Ornek-12: "+(karakterYeterliMi && enAzBirSembol));


        /* Ornek-14: Bir String’in belirli bir tek karaktere sahip olup olmadıgını üç farklı sekilde kontrol etmek
                     için kod yazınız.*/

        String or12 = "Benna";
        boolean sonuc121 = or12.contains("n");
        System.out.println("Ornek-14.1: " + sonuc121);

        String or121 = "Java";
        boolean sonuc122 = or121.replaceAll("[^v]","").length()>0;
        System.out.println("Ornek-14.2: " + sonuc122);

        String or123 = "Java";
        boolean sonuc124 = or123.indexOf("v")!=-1;
        System.out.println("Ornek-14.3: " + sonuc124);




























    }//main
}//class
