package hw02;

import java.util.Scanner;

/**
 * Created by user on 17.05.2017.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d;
        double x1;
        double x2;


        d = (double) (Math.pow(b , 2) - 4 * a * c);
        if (d > 0) {
            x1 = -b + Math.sqrt(d) / 2 * a;
            x2 = -b - Math.sqrt(d) / 2 * a;

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (d == 0) {
            x1 = -b / 2 * a;
            System.out.println("x = " + x1);
        } else {
            System.out.println("Корней нет!");
        }
    }
}
