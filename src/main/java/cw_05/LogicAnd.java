package cw_05;

public class LogicAnd {
    public static void main(String[] args) {
        int a = 20;

        /*if (a > 0) {
            if (a < 50) {
                if (a != 16) {
                    System.out.println("0 < a < 50");
                }
            }
        }*/

        /*if (a < 0 && a < 50 && a / 0 == 10) { // short schema
            System.out.println("0 < a < 50");
        }*/

        if (a < 0 & a < 50 & a / 0 == 10) { // full schema
            System.out.println("0 < a < 50");
        }
    }
}
