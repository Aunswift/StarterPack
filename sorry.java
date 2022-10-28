import java.util.Scanner;

public class sorry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen en sevdiğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Demek en sevdiğiniz sayı... " + sayi + " imis... Neyse, ");
        System.out.print("Ocakta yemek yapmak ister misiniz? ");

        String cevap = scanner.nextLine();
        System.out.print("Cevabın " + cevap + "ti ama üzgünüm. Bu imkansız. ");

        String aglama = scanner.nextLine();
        System.out.println(aglama + " diye sordun ama bir ocağın bile yok.");
    }
}
