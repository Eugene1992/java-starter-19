package cw_03;

public class InnerIf {
    public static void main(String[] args) {
        int k = 5;

        if (k != 5) {
            if (k != 7) {
                System.out.println("True");
            } else {
                System.out.println("Something else...");
            }
        }
    }
}
