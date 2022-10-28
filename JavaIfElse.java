import java.util.Scanner;
public class JavaIfElse {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if((n%2 == 1) && (n>0))
            {
                System.out.println("Weird");
            }
        if((n > 0) && (n%2 == 0) && (n >= 2) && (n <= 5))
            {
                System.out.println("Not Weird");
            }
        if((n > 0) && (n % 2 == 0) && (n >= 6) && (n <= 20))
            {
                System.out.println("Weird");
            }
        if((n > 0) && (n % 2 == 0) && (n > 20))
            {
                System.out.println("Not Weird");
            }
    }
}
