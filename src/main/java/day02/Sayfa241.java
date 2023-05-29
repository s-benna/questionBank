package day02;

public class Sayfa241 {
    public static void main(String[] args) {
        //Ornek-5: Byte data tipinde bir degisken olusturunuz ve onu bir double degiskenine dönüstürünüz.
        //Sonrasında bu double degiskenin degerini konsolda yazdırınız.
        byte   a = 23;
        double b = a;

        System.out.println("Ornek-5: "+b);

        //Wrapper Class
        //Ornek-1: Byte data tipinin minimum degeri ile short data tipinin maksimum degerinin toplamını
        //bulmak için bir kod yazınız.
        byte  min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;

        System.out.println("Ornek-1: " +(min+max));

        //Ornek-2: Data tipi String olan “103” degerini byte data tipine dönüstürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” degerini short data tipine dönüstürüp konsolda iki
        //degisken arasındaki farkı yazdırınız.

        byte ab = Byte.valueOf("103");
        short cd = Short.valueOf("2351");

        System.out.println("Ornek-2: "+(cd-ab));

        























    }//main
}//class
