import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class maks{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int a = scanner.nextInt();

        System.out.print("Lütfen ikinci sayınızı giriniz: ");
        int b = scanner.nextInt();

        System.out.print("Lütfen üçüncü sayınızı giriniz: ");
        int c = scanner.nextInt();

        int maks;

        if(a>=b && a>=c)
            {
                maks = a;
                System.out.println("Maks değer: " + maks);
            }
        else if(b>=a && b>=c)
            {
                maks = b;
                System.out.println("Maks değer: " + maks);
            }
        else
            {
                maks = c;
                System.out.println("Maks değer: " + maks);
            }
    }
}