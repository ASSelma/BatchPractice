package practice02;

import java.util.Scanner;

public class C04NestedTernary {


    public static void main(String[] args) {

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 1. tam sayiyi giriniz");

        int sayi1 = scan.nextInt();

        System.out.println("Lütfen 2. tam sayiyi giriniz");

        int sayi2 = scan.nextInt();

       System.out.println(sayi1 == sayi2 ? "Sayilar birbirine eşit": (sayi1>sayi2 ? sayi1 :  sayi2));


        //Alttaki gibi de yazılabilir..
        //Object result = a == b ? "Sayilar birbirine esit" : a > b ? a : b;
        //System.out.println(result);












    }
}
