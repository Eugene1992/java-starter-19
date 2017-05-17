package hw02;

import java.util.Scanner;

/**
 * Created by user on 17.05.2017.
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();

        if (x > y && x > z) {
            System.out.println(x);
        }
        if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

    }
}
