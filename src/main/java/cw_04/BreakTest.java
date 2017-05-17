package cw_04;

import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alcLevel = 0;
        while (true) {
            System.out.println("Do you wanna one more beer? (" + alcLevel + ")");
            String answer = scan.next();

            if (answer.equals("Yes")) {
                if (alcLevel == 10) {
                    System.out.println("Sorry, enough, bro!");
                    continue;
                }
                System.out.println("Cheeers!");
                alcLevel += 2;
            } else if (answer.equals("No")){
                System.out.println("Time to go home, dude!");
                break;
            } else {
                System.out.println("I dont understand you...");
            }
        }
        System.out.println("End");
    }
}
