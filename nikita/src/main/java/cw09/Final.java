package cw09;

import java.util.Scanner;

/**
 * Created by Student on 31-May-17.
 */
public class Final {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 10);
        System.out.println("Hello! I've just chose a random number. Try to guess. Good Luck!");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int num = scan.nextInt();
            int i = 0;
            i++;
            if (num == rand) {
                System.out.println("You're lucky!");
                System.out.println("You guessed right from the " + i + " attempt");
            } else {
                System.out.println("Sorry, you're wrong!");
            }
        }

    }
}

