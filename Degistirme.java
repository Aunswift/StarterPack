import java.util.Scanner;

public class Degistirme {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size ufak bir sihir gösterisi yapayım, lütfen bana iki tane sayı gir: ");

        System.out.print("1. Sayı: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("2. Sayı: ");
        double sayi2 = scanner.nextDouble();
        System.out.println("Girdiğin birinci sayı: " + sayi1 + " idi ve " + "girdiğin ikinci sayı da: " + sayi2 + " idi.");

        System.out.println("Sihir başlıyoooorrrr.");

        double gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;

        System.out.println("Şimdiyse, girdiğin ilk sayi " + sayi1 + " oldu. Girdiğin ikinci sayi ise " + sayi2 + " oldu.");
    }
}
