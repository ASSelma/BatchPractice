package practice01;

public class C01Variables01 {

    public static void main(String[] args) {

        //(int) bir variable(yas)  olustur ve yazdır
        //syntax:
        //data turu + variable + atama operatoru + varıable degeri
        int yas = 28;
        System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır
        int sayi= 23;
        System.out.println(sayi);
        System.out.println(sayi);
        System.out.println(sayi); //ctrl + d ile alt alta kopyalayabilirz.





        //konsola sayi = 50 seklinde yazdır

        System.out.println("sayi =" + 50);
        System.out.println("sayi = " + sayi);


        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala

       int benimYasim = yas;
        System.out.println("benimYasim = " + benimYasim);


        //String bir variable olusturalım (isim)

        String isim = "Selma";
        System.out.println(isim);



        //isim variable ını etiketıyle yazdır

        System.out.println("isim = " + isim);


        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala

        String onunIsmi = isim;


        //onunIsmi variable'ını etiketiyle yazdır

        System.out.println("onunIsmi = " + onunIsmi);

        //isim variable'ının degerini guncelle

          isim =  "Fatma";
        System.out.println("isim = " + isim);

        System.out.println("onunIsmi = " + onunIsmi);

        onunIsmi = "Hale";
        System.out.println("onunIsmi = " + onunIsmi);


        //isim ve onunIsmi variable'larını yazdır



















    }//main methodun sonu



}//class sonu
