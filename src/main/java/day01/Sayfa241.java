package day01;

public class Sayfa241 {
    public static void main(String[] args) {
        //Ornek-1: short data type'inde bir degisken olusturunuz ve onu bir int data type degiskenine donusturunuz.
        short yas  = 25;
        int yeniYas= yas;
        System.out.println(yas);

        //Ornek-2: long data type'inde bir degisken olusturunuz ve onu bir int data type degiskenine donusturunuz.
        long ornek2 = 12L;
        int yeniOrnek2 = (int) ornek2;
        System.out.println(yeniOrnek2);

        //Ornke-3: double data type'inde bir degisken olusturunuz ve onu bir float data type degiskenine donusturunuz.
        double fiyat = 12.99;
        float yeniFiyat = (float) fiyat;
        System.out.println(yeniFiyat);

        //Ornek-4: double data type'inde bir degisken olusturunuz ve onu bir short data type degiskenine donusturunuz.
        double elmaFiyati = 49.99;
        short zamliElma = (short) elmaFiyati;
        System.out.println(zamliElma);

























    }//main
}//class
