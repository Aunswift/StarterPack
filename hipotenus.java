import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hipotenüsü hesaplamam için gereken kenar uzunluklarını giriniz.");

        System.out.print("Birinci kenar uzunluğu: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci kenar uzunluğu: ");
        double kenar2 = scanner.nextDouble();

        double hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));

        System.out.print("Girilen ilk kenar verisi " + kenar1 + ", ve ikinci kenar verisi " + kenar2
        + " verilerine göre hipotenüs uzunluğu: " + hipotenus);
    }
    
}
