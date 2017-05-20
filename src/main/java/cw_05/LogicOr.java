package cw_05;

public class LogicOr {
    public static void main(String[] args) {
        int a = 20;

        /*if (a > 0) {
            System.out.println("a");
        } else if (a != 10) {
            System.out.println("a");
        }

        if (a > 0 || a != 10) {
            System.out.println("a");
        }*/

        /*if (a > 0 || a / 0 == 2) {
            System.out.println("!");
        }*/

        if (a > 0 | a / 0 == 2) {
            System.out.println("!");
        }
    }
}
