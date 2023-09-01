package practice02;

import java.util.Scanner;

public class C03Ternary {
    public static void main(String[] args) {

        //TERNARY
        //condition  ? : durum1 : durum2

        /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */


        Scanner scan = new Scanner (System.in);

        System.out.println("Lütfen bir sayi giriniz");

        int sayi = scan.nextInt();



        Object result =  sayi%2==0  ? "Cift Sayı" : sayi+3;

        System.out.println(result);



    }
}
