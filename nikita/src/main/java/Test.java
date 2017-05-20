import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d;
        double x1;
        double x2;
        d = (double) (Math.pow(b , 2) - 4 * a * c);
        x1 = b - Math.sqrt(d) / 2;
        System.out.println("x1 = " + x1);

    }
}
