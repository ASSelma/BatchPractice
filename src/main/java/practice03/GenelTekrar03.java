package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class GenelTekrar03 {

    public static void main(String[] args) {
       /*

       Scanner scan=new Scanner(System.in);

        int toplam=0;
        int sayac=0;

        do {
            System.out.println("Lutfen pozitif bir tamsayi giriniz\nBitirmak icin 0'a basin");
            int sayi= scan.nextInt();

            if (sayi==0){
                break;
            } else if (sayi<0) {
                System.out.println("Negatif sayi kullanamazsin");

            }else{
                toplam+=sayi;//toplam=toplam+sayi
                sayac++;
            }



        } while (true );
*/

        // 5 elemanlı bir array oluştur




        int [] arr = new int [5];

        System.out.println(Arrays.toString(arr));  //[0,0,0,0,0]


        //Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız.




        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {

            System.out.println("lütfen bir sayı giriniz");

            int sayi = scan.nextInt();

            arr[i] = sayi;



        }


        System.out.println(Arrays.toString(arr));


        //Arrayin elemanlarının ortalmasını bulunuz.Ortalamayı yazdırın.

        double toplam = 0;


        for ( int each  : arr) {

            toplam+=each;
        }
        System.out.println("toplam = " + toplam);
        
      double ortalama = toplam/arr.length;

        System.out.println("ortalama = " + ortalama);

        
// Ortalamadan daha büyük olan array elemanlarını yazdırınız.


        for (int each :  arr) {
            
            if(each>ortalama){

                System.out.println(each + " ");
                
            }
            
        }

        System.out.println();
//Arrayin elemanlarını işaretlerini değiştiren bir kod yazınız.


        for (int i = 0; i < arr.length ; i++) {

            arr[i] = arr[i]*-1;




        }

        System.out.println(Arrays.toString(arr));











    }
}
