package hw02;

import java.util.Scanner;

/**
 * Created by user on 17.05.2017.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();

        if (a > b && a > c && a > d) {
            System.out.println(b);
        } else if (b > c && b > d) {
            System.out.println(a);
        } else if (d > c) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

    }
}
