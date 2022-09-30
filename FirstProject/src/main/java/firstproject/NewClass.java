package firstproject;
import java.util.Scanner;

public class NewClass {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte desetinne cislo x:");
        double x = sc.nextDouble();
        System.out.println("Zadejte desetinne cislo y:");
        double y = sc.nextDouble();
        System.out.format("x + y = %f + %f = %f\n", x, y, x + y);
        System.out.format("x * y = %f * %f = %f\n", x, y, x * y);
    }
}