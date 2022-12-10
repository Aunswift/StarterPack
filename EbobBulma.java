package Metodlar;

import java.util.Scanner;

public class EbobBulma {
    public static int EBOB(int a, int b){
        int ebob=1;
            for(int i=2;i<=b && i<=a;i++){;
                if(a%i==0 && b%i==0){
                    ebob = i;
                }
            }
        return ebob;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen iki değer giriniz: ");
        int a = scanner.nextInt(); int b = scanner.nextInt();
        scanner.close();
        System.out.println(EBOB(a, b));
    }
}
