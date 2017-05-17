package hw02;

import java.util.Scanner;

/**
 * Created by user on 16.05.2017.
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        if (i % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Uneven");
        }
    }
}
