package Metodlar;

import java.util.Scanner;

public class MetodGiris {

   public static void Faktoriyel(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Lütfen faktöriyeli alınacak değeri giriniz: ");
      int deger = scanner.nextInt();
      int toplam = 1;
      for(int i=1;i<=deger;i++)
      {
         toplam *= i;
      }
      System.out.println(deger+" sayısının faktöriyeli "+toplam+" değeridir.");
      scanner.close();
   }
   public static void main(String[] args)
{
/*
   Metodlarda public yazan yer ERİŞİM BELİRLEYİCİ'dir. public, private, protected gibi değerler alabilir.
   Metodlarda static yazan yer EKSTRA ÖZELLİKLER'dir. static vs gibi değerler alabilir. KULLANILMAK ZORUNDA DEĞİLDİR.
   Metodlarda void yazan yer DÖNÜŞ TİPİ'dir. void, return gibi değerler alabilir.
   Metodlarda main yazan yer FONKSİYON ADI'dır. İstediğimiz adı koyabiliriz.
   Metodlarda parantez içi PARAMETRELER'dir. Boş olabilir.
 */

   Faktoriyel(); // Bir metodu çağırmak için direkt metodun adı kullanılır.
}

}
