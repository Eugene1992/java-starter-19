package lessons.myTests;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alcLevel = 0;
        System.out.println("Choose minus (-) or pus(+) for your answer");
        while (true) {
            System.out.println("Do you wanna one more beer? (" + alcLevel + ")");
            String answer = scan.next();
            if (answer.equals("+")) {
                if (alcLevel == 4) {
                    System.out.println("slow down");
                } else if (alcLevel == 6) {
                    System.out.println("chillout ");
                } else if (alcLevel == 8) {
                    System.out.println("on a horse ");
                }
                System.out.println("Cheers!");
                alcLevel += 2;
                if (alcLevel == 10) {
                    System.out.println("Sorry, enough, bro!");
                    break;
                }
            } else if (answer.equals("-")) {
                System.out.println("Time to go home, dude!");
                break;
            } else if (answer.equals("+-")) {
                System.out.println("оприділися");
            } else {
                System.out.println("I don't understand you...");
                System.out.println("Choose minus (-) or pus(+) for your answer");

            }
        }
        System.out.println("End");
    }
}

