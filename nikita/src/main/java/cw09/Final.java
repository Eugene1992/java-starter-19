package cw09;

import java.util.Scanner;

/**
 * Created by Student on 31-May-17.
 */
public class Final {
    public static void main(String[] args) {
        int rand;
        System.out.println("Hello! I've just chose a random number. Try to guess. Good Luck!");
        Scanner scan = new Scanner(System.in);
        int attempts = 0;
        while (true) {
            rand = (int) (Math.random() * 10);
            System.out.println("Enter your number, please: " + rand);
            int num = scan.nextInt();
            attempts++;
            if (num == rand) {
                System.out.println("You're lucky!");
                System.out.println("You guessed right from the " + attempts + " attempt");
                break;
            } else {
                System.out.println("Sorry, you're wrong!");
            }
        }
    }
}

