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
        if (a > b && a > d && a < c) {
            System.out.println(a);
        } else if (a > b && a > c && a < d) {
            System.out.println(a);
        } else if (a > d && a > c && a < b) {
            System.out.println(a);
        } else if (b > a && b > d && b < c) {
            System.out.println(b);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (b > d && b > c && b < a) {
            System.out.println(b);
        } else if (c > d && c > b && c < a){
            System.out.println(c);
        } else if (c > b && c > a && c < d) {
            System.out.println(c);
        } else if (c > a && c > d && c < b) {
            System.out.println(c);
        } else if (d > a && d > b && d < c){
            System.out.println(d);
        } else if (d > a && d > c && d < b) {
            System.out.println(d);
        } else if (d > b && d > c && d < a) {
            System.out.println(d);
        }
    }
}