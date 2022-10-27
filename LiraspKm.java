import java.util.Scanner;

public class LiraspKm {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); {
                System.out.print("Lütfen kullandığınız yakıt türünü yazınız: ");
                String yakit = scanner.nextLine();

                boolean dizel = yakit.equalsIgnoreCase("Dizel");
                boolean benzin = yakit.equalsIgnoreCase("Benzin");
                boolean gaz = yakit.equalsIgnoreCase("Gaz");
                boolean gaz1 = yakit.equalsIgnoreCase("Otogaz");
                boolean gaz2 = yakit.equalsIgnoreCase("LPG");

                if(dizel) // cevap dizelse
                    {
                        System.out.print("Lütfen kaç kilometre gideceğinizi yazınız: ");
                        double yol = scanner.nextDouble();

                        System.out.print("Lütfen aracınızın 100 kilometrede kaç Litre yakıt tükkettiğini yazın: ");
                        double tuketim = scanner.nextDouble();
                        scanner.nextLine(); //dummy
                       
                        System.out.print("Lütfen aldığınız dizelin ortalama Litre fiyatını giriniz: ");
                        double dizelfiyat = scanner.nextDouble();
                        scanner.nextLine(); //dummy

                        double hesaplama = ((tuketim*yol)/100)*dizelfiyat;
                        System.out.println(hesaplama + "TL değerinde yakıt tüketeceksiniz.");
                    }
                if(benzin) // cevap benzinse
                    {
                        System.out.print("Lütfen kaç kilometre gideceğinizi yazınız: ");
                        double yol = scanner.nextDouble();

                        System.out.print("Lütfen aracınızın 100 kilometrede kaç Litre yakıt tükkettiğini yazın: ");
                        double tuketim = scanner.nextDouble();
                        scanner.nextLine(); //dummy
                       
                        System.out.print("Lütfen aldığınız benzinin ortalama Litre fiyatını giriniz: ");
                        double benzinfiyat = scanner.nextDouble();
                        scanner.nextLine(); //dummy

                        double hesaplama = ((tuketim*yol)/100)*benzinfiyat;
                        System.out.println(hesaplama + "TL değerinde yakıt tüketeceksiniz.");
                    }
                if(gaz || gaz1 || (gaz2))
                    {
                        System.out.print("Lütfen kaç kilometre gideceğinizi yazınız: ");
                        double yol = scanner.nextDouble();

                        System.out.print("Lütfen aracınızın 100 kilometrede kaç Litre yakıt tükkettiğini yazın: ");
                        double tuketim = scanner.nextDouble();
                        scanner.nextLine(); //dummy
               
                        System.out.print("Lütfen aldığınız gazın ortalama Litre fiyatını giriniz: ");
                        double gazfiyat = scanner.nextDouble();
                        scanner.nextLine(); //dummy

                        double hesaplama = ((tuketim*yol)/100)*gazfiyat;
                        System.out.println(hesaplama + "TL değerinde yakıt tüketeceksiniz.");
                    }

            }
    } 
}
