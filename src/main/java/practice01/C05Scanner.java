package practice01;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */

        //Kullanıcıdan veri almak için scanner kullanırız.
        //1. adım scanner objesi oluştur.

        Scanner scan = new Scanner (System.in) ;

        //kullanıcıya mesaj verelim.

        System.out.println("Lütfen karesini bulmak istediğiniz sayıyı giriniz");

        int sayi = scan.nextInt();

        System.out.println(sayi);

        //girdiğinz sayının karesi : 529'dur.


        System.out.println("Girdiğiniz sayının karesi : "+sayi*sayi +" olarak bulunmustur");




    }
}
