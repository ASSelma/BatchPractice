package practice01;

import java.util.Scanner;

public class GenelTekrar1 {
    public static void main(String[] args) {
        /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl

         */

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        double ort = ((num1+num2+num3+num4+num5)/5);

        System.out.println("Ortalama = " + ort );

 /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */

     /*
        String isim = "Ali";
        String soyIsim =  "Can";
        byte yas = 28;
        double boy = 1.78;
        byte kilo = 75;
        System.out.println("isim =" + isim + "\nSoyisim = "  +  soyIsim +  "\nyas = " + yas + "\nboy ="  + boy + "\nkilo = " + kilo);

*/

  /*
        2 tane string, 2 tane int data turunde variable olusturun
        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;
        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın


         */

      /*  String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;

        System.out.println(str1+sayi1+str2);
        System.out.println(sayi1+sayi2+str1);
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));
        System.out.println(sayi1+""+sayi2+""+str2);



      Scanner girdi = new Scanner (System.in);

      System.out.println("Adınızı Giriniz");

      String ad = girdi.next();
        System.out.println(ad);
 */


        String s1 = "Java Kolaydır";
        System.out.println(s1.toUpperCase());







    }

}
