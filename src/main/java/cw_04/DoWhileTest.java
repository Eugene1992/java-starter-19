package cw_04;

public class DoWhileTest {
    public static void main(String[] args) {
        int count = 10;

        do {
            System.out.println("Hello world!");
            count--;
        } while (count < 0);

        System.out.println("End");
    }
}
