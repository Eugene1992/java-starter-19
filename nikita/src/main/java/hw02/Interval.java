package hw02;

import java.util.Scanner;

/**
 * Created by user on 17.05.2017.
 */
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        if (x >= 0 && x <= 14) {
            System.out.println("Число попадает в промежуток [0 - 14]");
        } else if (x >= 15 && x <= 35) {
            System.out.println("Число попадает в промежуток [15 - 35]");
        } else if (x >= 36 && x <= 50) {
            System.out.println("Число попадает в промежуток [36 - 50]");
        } else if (x >= 51 && x <= 100) {
            System.out.println("Число попадает в промежуток [51 - 100]");
        } else {
            System.out.println("Число не попало ни в один из промежутков!");
        }
    }
}
