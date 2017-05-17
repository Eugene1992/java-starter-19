package cw_04;

public class ForTestSec {
    public static void main(String[] args) {
        for (int counter = 0, value = 10; counter < 100 && value != 100; counter += 2, value--) {
            System.out.println(value);
        }
    }
}
