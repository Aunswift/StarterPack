package Metodlar;

import java.util.Scanner;

public class AsalDegisken {
   public static boolean AsalMi(int a){
        for(int i=2;i<a;i++)
        {
            if(a%i==0){
                return false;
            }
        }
        return true;
   }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir değer giriniz: ");
        int sayi = scanner.nextInt();

        while(sayi<=0){
            System.out.print("Lütfen pozitif bir değer giriniz: "); 
            sayi = scanner.nextInt(); 
            scanner.close();
        }
        for(int k=2; k<sayi;k++){
            if(AsalMi(k))
                System.out.print(k + " ");
       }
    }
}
