package practice02;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
         /*
    Kullanıcıdan uc basamaklı pozitif bir sayı sisteme girmesini isteyiniz

    Bu sayıyı okunuşuna çeviren bir kod yazınız.

    or: girilen sayı = 425
    konsolda;
    dort yuz
    yirmi
    bes
  */

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz.");
        int number = scan.nextInt();

        if (number<100 || number >999){
            System.out.println("Hatalı giriş. Tekrar deneyiniz");

        }else {
            int yuzler = number / 100;
            int onlar = (number % 100) / 10;
            int birler = number % 10;

            switch (yuzler) {
                case 1: System.out.print(" yüz "); break;
                case 2: System.out.print("iki yüz "); break;
                case 3: System.out.print("üç yüz "); break;
                case 4: System.out.print("dört yüz "); break;
                case 5: System.out.print("beş yüz "); break;
                case 6: System.out.print("altı yüz "); break;
                case 7: System.out.print("yedi yüz "); break;
                case 8: System.out.print("sekiz yüz "); break;
                case 9: System.out.print("dokuz yüz "); break;
            }

            switch (onlar) {
                case 1: System.out.print("on "); break;
                case 2: System.out.print("yirmi "); break;
                case 3: System.out.print("otuz "); break;
                case 4: System.out.print("kırk "); break;
                case 5: System.out.print("elli "); break;
                case 6: System.out.print("altmış "); break;
                case 7: System.out.print("yetmiş "); break;
                case 8: System.out.print("seksen "); break;
                case 9: System.out.print("doksan "); break;
            }

            switch (birler) {
                case 1: System.out.print("bir"); break;
                case 2: System.out.print("iki"); break;
                case 3: System.out.print("üç"); break;
                case 4: System.out.print("dört");break;
                case 5: System.out.print("beş"); break;
                case 6: System.out.print("altı"); break;
                case 7: System.out.print("yedi"); break;
                case 8: System.out.print("sekiz"); break;
                case 9: System.out.print("dokuz"); break;
            }





        }


    }


}