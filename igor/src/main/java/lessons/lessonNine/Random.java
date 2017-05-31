package lessons.lessonNine;

import java.util.Scanner;

/**
 * Created by User on 5/31/2017.
 */
public class Random {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter nuber (from 1 to 9) for your answer");
        while (true) {
            System.out.println("Whats your number? (" + count + ")");
            String answer = scan.next();
        }
    }
}
