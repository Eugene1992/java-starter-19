package hw02;

import java.util.Scanner;

/**
 * Created by user on 17.05.2017.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter first number: ");
        double x = scan.nextDouble();
        System.out.println("Please, enter second number: ");
        double y = scan.nextDouble();
        double a;
        double b;

        if (x >= 10) {
            a = x - 10;
        } else {
            a = 10 - x;
        }

        if (y >= 10) {
            b = y - 10;
        } else {
            b = 10 - y;
        }

        if (a > b) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
}

